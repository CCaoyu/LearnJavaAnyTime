package com.learnjavaanytime.study.dao;

import com.learnjavaanytime.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-13 17:26:05
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
