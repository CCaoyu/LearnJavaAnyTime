package com.learnjavaanytime.study.dao;

import com.learnjavaanytime.study.entity.TimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:34:40
 */
@Mapper
public interface TimeDao extends BaseMapper<TimeEntity> {
	
}
