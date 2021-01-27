package com.learnjavaanytime.question;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.learnjavaanytime.question.entity.TypeEntity;
import com.learnjavaanytime.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LearnQuestionApplicationTests {

    @Autowired
    TypeService typeService;

    // 创建题目类型
    @Test
    void testCreateType() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setType("javaBasic");
        typeService.save(typeEntity);
        System.out.println("创建成功");
        TypeEntity typeEntity2 = new TypeEntity();
        typeEntity2.setType("jvm");
        typeService.save(typeEntity2);
        System.out.println("创建成功");
    }

    // 更新题目类型
    @Test
    void testUpdateType() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setId(1L);
        typeEntity.setType("jvm");
        typeService.updateById(typeEntity);
        System.out.println("修改成功");
    }

    // 查询题目类型
    @Test
    void testSelectType() {
        List<TypeEntity> typeEntityList = typeService.list(new QueryWrapper<TypeEntity>().eq("id",1L));
        typeEntityList.forEach((item)-> {
            System.out.println(item);
        });
        System.out.println("查询成功");
    }

    // 删除题目类型记录
    @Test
    void testRemoveType() {
        typeService.removeById(2L);
        System.out.println("删除成功");
    }
}
