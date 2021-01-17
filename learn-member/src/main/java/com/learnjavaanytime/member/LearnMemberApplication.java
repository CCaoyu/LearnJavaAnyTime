package com.learnjavaanytime.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.sql.DataSource;


@EnableFeignClients(basePackages = "com.learnjavaanytime.member.feign")
@EnableDiscoveryClient
@MapperScan("com.learnjavaanytime.member.dao")

@SpringBootApplication
public class LearnMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnMemberApplication.class, args);
    }

}
