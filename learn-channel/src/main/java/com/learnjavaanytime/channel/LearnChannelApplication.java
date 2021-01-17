package com.learnjavaanytime.channel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.learnjavaanytime.channel.dao")
public class LearnChannelApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnChannelApplication.class, args);
    }

}
