package com.omt.common.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

/**
 * Created by wangbl on 16/8/23.
 */
@Configuration
@ComponentScan("com.omt")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    AuthenticationService authenticationService;
    //DaoAuthenticationProvider
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();
        //http.csrf().disable();

        http
                .csrf().requireCsrfProtectionMatcher(new RequestMatcher() {

            private Pattern allowedMethods =
                    Pattern.compile("^(POST|GET|HEAD|TRACE|OPTIONS)$");

            private RegexRequestMatcher apiMatcher =
                    new RegexRequestMatcher("/v[0-9]*/.*", null);

            @Override
            public boolean matches(HttpServletRequest request) {
                // CSRF disabled on allowedMethod
                if(allowedMethods.matcher(request.getMethod()).matches())
                    return false;

                // CSRF disabled on api calls
                if(apiMatcher.matches(request))
                    return false;

                // CSRF enables for other requests
                return true;
            }
        });
        //增加"/**",是为开发调试使用，正式环境应该把此取消
        http.authorizeRequests()
                .antMatchers("/login.jsp","/static/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                //.loginPage("http://10.117.70.123:8084/portal")
                //.usernameParameter("username")
                //.passwordParameter("password")
                //.defaultSuccessUrl("http://10.110.22.168:11400/npage/operationManage.html?edition=standard")
                .successForwardUrl("/wkh")
                //.failureForwardUrl("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
        //.sessionManagement().maximumSessions(1)
        //.expiredUrl("/login?expired");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //表示输入的密码会通过SHA-256进行加密
        //ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        //encoder.setEncodeHashAsBase64(true);
        //BCryptPasswordEncoder bencoder = new ExtendBCryptPasswordEncoder();
        auth.userDetailsService(authenticationService).passwordEncoder(encoder);

        //auth.userDetailsService(authenticationService).passwordEncoder(bencoder);
        //此方式属于内存校验
        /*auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");*/

    }
}
