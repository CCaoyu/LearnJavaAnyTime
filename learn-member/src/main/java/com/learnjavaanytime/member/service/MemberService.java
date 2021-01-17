package com.learnjavaanytime.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:37:59
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

