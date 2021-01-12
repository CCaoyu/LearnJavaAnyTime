package com.learnjavaanytime.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.question.entity.QesQuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-12 17:13:20
 */
public interface QesQuestionService extends IService<QesQuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

