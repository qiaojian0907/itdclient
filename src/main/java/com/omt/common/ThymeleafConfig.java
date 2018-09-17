package com.omt.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/*import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;*/

/**
 * Created by wangbl on 2017/11/30.
 */
//@Configuration
//@EnableWebMvc
public class ThymeleafConfig {
    @Autowired
    ApplicationContext applicationContext;
    /*@Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine) {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        viewResolver.setCache(false);
        return viewResolver;
    }
    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setEnableSpringELCompiler(true);
        engine.setTemplateResolver(templateResolver());
        return engine;
    }

    private ITemplateResolver templateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setApplicationContext(applicationContext);
        URL resource = this.getClass().getClassLoader().getResource("templates/");        //这里把系统获取到的Class的path替换为源码对应的Path，这样修改的时候就可以动态刷新
        String devResource = resource.getFile().toString().replaceAll("build/resources/main", "src/main/resources");
        resolver.setPrefix("file:"+devResource);       //不允许缓存
                resolver.setCacheable(false);
        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);
        return resolver;
    }*/
}
