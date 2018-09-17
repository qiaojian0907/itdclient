package com.omt.common.security;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by wangbl on 16/8/23.
 */
@Service
public class AuthenticationService implements UserDetailsService {
    @Autowired
    private UserService userService;
    private static Logger logger = Logger.getLogger(UserService.class);
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        logger.info("登陆用户名称="+username);
        UserDto userDto = userService.getUserInfo(username);
        logger.info("登陆密码="+userDto.getPassword());
        GrantedAuthority authority = new SimpleGrantedAuthority(userDto.getRole());
        UserDetails userDetails = (UserDetails)new User(userDto.getUsername(),
                userDto.getPassword(), Arrays.asList(authority));
        return userDetails;
    }
}
