package com.learnjavaanytime.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:39:06
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

