package com.learnjavaanytime.question;

import com.learnjavaanytime.question.entity.QesTypeEntity;
import com.learnjavaanytime.question.service.QesTypeService;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.learnjavaanytime.question.dao")
@SpringBootApplication
public class LearnQuestionApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnQuestionApplication.class, args);
    }
}
