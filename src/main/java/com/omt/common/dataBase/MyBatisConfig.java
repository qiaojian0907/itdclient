package com.omt.common.dataBase;

import com.omt.common.page.PageInterceptor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.ClassUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by wangbl on 16/7/12.
 */
@Configuration
public class MyBatisConfig {
    public static Log logger = LogFactory.getLog(MyBatisConfig.class);

    @Autowired
    @Qualifier("primaryDataSource")
    DataSource dataSource ;
    /*@Bean
    public JdbcTemplate springSessionJdbcOperations() {
        return new JdbcTemplate(dataSource);
    }*/
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {

        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));

        sessionFactory.setMapperLocations(getResource("mapper", "**/*.xml"));
/*
        sessionFactory.setTypeAliasesPackage("com.isea533.ssm.model");
*/
        Interceptor[] interceptors = new Interceptor[1];
        interceptors[0] =new PageInterceptor();
        //interceptors[1] = new ParameterInterceptor();
        Properties p =new Properties();
        p.put("databaseType","mysql");
        interceptors[0].setProperties(p);
        //interceptors[1].setProperties(p);
        sessionFactory.setPlugins(interceptors);

        return sessionFactory.getObject();
    }



    @Bean
    public SqlSessionTemplate sqlSessionTemplate()throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }

    @Bean
    public JdbcTemplate jdbcTemplate()throws Exception {
        return new JdbcTemplate(dataSource);
    }

    public Resource[] getResource(String basePackage, String pattern) throws IOException {
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
                + ClassUtils.convertClassNameToResourcePath(new StandardEnvironment()
                .resolveRequiredPlaceholders(basePackage)) + "/" + pattern;
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources(packageSearchPath);
        return resources;
    }



}
