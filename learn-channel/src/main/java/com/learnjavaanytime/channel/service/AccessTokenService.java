package com.learnjavaanytime.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:36:51
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

