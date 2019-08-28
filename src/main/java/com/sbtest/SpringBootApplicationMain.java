package com.sbtest;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


/**
 * @SpringBootApplication：标注一个主程序类，用来标明这是一个Spring Boot应用
 */
@SpringBootApplication
@MapperScan("com.sbtest.mapper")
public class SpringBootApplicationMain {

//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver
//                .getResources("classpath:/mapping/*.xml"));
//        // 加载全局的配置文件
//        sqlSessionFactoryBean.setConfigLocation(
//                new DefaultResourceLoader().getResource("classpath:mybatis-config.xml"));
//        return sqlSessionFactoryBean.getObject();
//    }

    // Spring应用启动起来
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
    }
}
