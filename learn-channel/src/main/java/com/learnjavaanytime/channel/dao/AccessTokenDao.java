package com.learnjavaanytime.channel.dao;

import com.learnjavaanytime.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:36:51
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
