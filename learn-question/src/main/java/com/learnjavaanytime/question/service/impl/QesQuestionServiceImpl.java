package com.learnjavaanytime.question.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.common.utils.Query;

import com.learnjavaanytime.question.dao.QesQuestionDao;
import com.learnjavaanytime.question.entity.QesQuestionEntity;
import com.learnjavaanytime.question.service.QesQuestionService;


@Service("qesQuestionService")
public class QesQuestionServiceImpl extends ServiceImpl<QesQuestionDao, QesQuestionEntity> implements QesQuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QesQuestionEntity> page = this.page(
                new Query<QesQuestionEntity>().getPage(params),
                new QueryWrapper<QesQuestionEntity>()
        );

        return new PageUtils(page);
    }

}