package com.learnjavaanytime.question.dao;

import com.learnjavaanytime.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:40:32
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}
