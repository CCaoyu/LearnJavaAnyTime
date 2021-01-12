package com.learnjavaanytime.question;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.learnjavaanytime.question.entity.QesTypeEntity;
import com.learnjavaanytime.question.service.QesTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.util.List;

@SpringBootTest
class LearnQuestionApplicationTests {

    @Autowired
    QesTypeService typeService;

    // 创建题目类型
    @Test
    void testCreateType() {
        QesTypeEntity typeEntity = new QesTypeEntity();
        typeEntity.setType("javaBasic");
        typeService.save(typeEntity);
        System.out.println("创建成功");
    }

    // 更新题目类型
    @Test
    void testUpdateType() {
        QesTypeEntity typeEntity = new QesTypeEntity();
        typeEntity.setId(1L);
        typeEntity.setType("jvm");
        typeService.updateById(typeEntity);
        System.out.println("修改成功");
    }

    // 查询题目类型
    @Test
    void testSelectType() {
        List<QesTypeEntity> typeEntityList = typeService.list(new QueryWrapper<QesTypeEntity>().eq("id",1L));
        typeEntityList.forEach((item)-> {
            System.out.println(item);
        });
        System.out.println("查询成功");
    }

    // 删除题目类型记录
    @Test
    void testRemoveType() {
        typeService.removeById(1L);
        System.out.println("删除成功");
    }
}
