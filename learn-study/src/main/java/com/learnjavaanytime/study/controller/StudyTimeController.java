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

import com.learnjavaanytime.study.entity.StudyTimeEntity;
import com.learnjavaanytime.study.service.StudyTimeService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.common.utils.R;

//import org.apache.shiro.authz.annotation.RequiresPermissions;



/**
 * 学习-用户学习时常表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-13 17:26:05
 */
@RestController
@RequestMapping("study/studytime")
public class StudyTimeController {
    @Autowired
    private StudyTimeService studyTimeService;

    /*@RequestMapping("/member/list/test/{id}")*/
    @RequestMapping("/member/list/test")
    /*public R memberStudyTimeTest(@PathVariable("id") Long id){*/
    public R memberStudyTimeTest(){
        StudyTimeEntity studyTimeEntity = new StudyTimeEntity();
        studyTimeEntity.setTotalTime(100);
        studyTimeEntity.setQuesType(1L);
        return R.ok().put("stuTime",Arrays.asList(studyTimeEntity));
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("study:studytime:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = studyTimeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("study:studytime:info")
    public R info(@PathVariable("id") Long id){
		StudyTimeEntity studyTime = studyTimeService.getById(id);

        return R.ok().put("studyTime", studyTime);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("study:studytime:save")
    public R save(@RequestBody StudyTimeEntity studyTime){
		studyTimeService.save(studyTime);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("study:studytime:update")
    public R update(@RequestBody StudyTimeEntity studyTime){
		studyTimeService.updateById(studyTime);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("study:studytime:delete")
    public R delete(@RequestBody Long[] ids){
		studyTimeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
