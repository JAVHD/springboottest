package com.sbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication：标注一个主程序类，用来标明这是一个Spring Boot应用
 */
@SpringBootApplication
public class SpringBootApplicationMain {
    // Spring应用启动起来
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
    }
}
