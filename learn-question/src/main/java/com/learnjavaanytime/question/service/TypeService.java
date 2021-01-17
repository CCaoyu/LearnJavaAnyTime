package com.learnjavaanytime.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:40:32
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

