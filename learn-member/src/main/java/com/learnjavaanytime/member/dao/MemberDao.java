package com.learnjavaanytime.member.dao;

import com.learnjavaanytime.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:37:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
