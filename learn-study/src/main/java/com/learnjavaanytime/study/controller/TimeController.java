package com.learnjavaanytime.study.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learnjavaanytime.study.entity.TimeEntity;
import com.learnjavaanytime.study.service.TimeService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.common.utils.R;

//import org.apache.shiro.authz.annotation.RequiresPermissions;



/**
 * 学习-用户学习时常表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:34:40
 */
@RestController
@RequestMapping("study/time")
public class TimeController {
    @Autowired
    private TimeService timeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("study:time:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = timeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("study:time:info")
    public R info(@PathVariable("id") Long id){
		TimeEntity time = timeService.getById(id);

        return R.ok().put("time", time);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("study:time:save")
    public R save(@RequestBody TimeEntity time){
		timeService.save(time);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("study:time:update")
    public R update(@RequestBody TimeEntity time){
		timeService.updateById(time);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("study:time:delete")
    public R delete(@RequestBody Long[] ids){
		timeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
