package com.learnjavaanytime.content.dao;

import com.learnjavaanytime.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:39:06
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
