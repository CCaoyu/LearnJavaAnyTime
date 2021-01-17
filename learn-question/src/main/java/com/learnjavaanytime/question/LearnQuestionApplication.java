package com.learnjavaanytime.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.learnjavaanytime.question.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class LearnQuestionApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnQuestionApplication.class, args);
    }
}
