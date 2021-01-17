package com.learnjavaanytime.study;

import cn.hutool.core.util.NetUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.learnjavaanytime.member.feign")
@EnableDiscoveryClient
@MapperScan("com.learnjavaanytime.study.dao")
public class LearnStudyApplication {

    public static void main(String[] args) {
        int port = 12000;
        if(!NetUtil.isUsableLocalPort(port)){
            System.out.printf("端口%d被占用了，无法启动%n",port);
            System.exit(1);
        }
        SpringApplication.run(LearnStudyApplication.class, args);
    }

}
