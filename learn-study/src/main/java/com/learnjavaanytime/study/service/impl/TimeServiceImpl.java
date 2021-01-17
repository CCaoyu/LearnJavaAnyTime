package com.learnjavaanytime.study.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.common.utils.Query;

import com.learnjavaanytime.study.dao.TimeDao;
import com.learnjavaanytime.study.entity.TimeEntity;
import com.learnjavaanytime.study.service.TimeService;


@Service("timeService")
public class TimeServiceImpl extends ServiceImpl<TimeDao, TimeEntity> implements TimeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TimeEntity> page = this.page(
                new Query<TimeEntity>().getPage(params),
                new QueryWrapper<TimeEntity>()
        );

        return new PageUtils(page);
    }

}