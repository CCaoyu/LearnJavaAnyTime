package com.learnjavaanytime.question.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.common.utils.Query;

import com.learnjavaanytime.question.dao.QesTypeDao;
import com.learnjavaanytime.question.entity.QesTypeEntity;
import com.learnjavaanytime.question.service.QesTypeService;


@Service("qesTypeService")
public class QesTypeServiceImpl extends ServiceImpl<QesTypeDao, QesTypeEntity> implements QesTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QesTypeEntity> page = this.page(
                new Query<QesTypeEntity>().getPage(params),
                new QueryWrapper<QesTypeEntity>()
        );

        return new PageUtils(page);
    }

}