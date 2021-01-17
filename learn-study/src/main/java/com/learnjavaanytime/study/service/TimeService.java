package com.learnjavaanytime.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.study.entity.TimeEntity;

import java.util.Map;

/**
 * 学习-用户学习时常表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:34:40
 */
public interface TimeService extends IService<TimeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

