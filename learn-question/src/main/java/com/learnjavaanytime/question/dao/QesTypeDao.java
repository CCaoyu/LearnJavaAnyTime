package com.learnjavaanytime.question.dao;

import com.learnjavaanytime.question.entity.QesTypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-12 17:13:20
 */
@Mapper
public interface QesTypeDao extends BaseMapper<QesTypeEntity> {
	
}
