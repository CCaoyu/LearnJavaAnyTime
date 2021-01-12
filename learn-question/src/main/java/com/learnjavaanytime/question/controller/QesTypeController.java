package com.learnjavaanytime.question.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learnjavaanytime.question.entity.QesTypeEntity;
import com.learnjavaanytime.question.service.QesTypeService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.common.utils.R;

//import org.apache.shiro.authz.annotation.RequiresPermissions;



/**
 * 题目-题目类型表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-12 17:13:20
 */
@RestController
@RequestMapping("question/qestype")
public class QesTypeController {
    @Autowired
    private QesTypeService qesTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("question:qestype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qesTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("question:qestype:info")
    public R info(@PathVariable("id") Long id){
		QesTypeEntity qesType = qesTypeService.getById(id);

        return R.ok().put("qesType", qesType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("question:qestype:save")
    public R save(@RequestBody QesTypeEntity qesType){
		qesTypeService.save(qesType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("question:qestype:update")
    public R update(@RequestBody QesTypeEntity qesType){
		qesTypeService.updateById(qesType);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("question:qestype:delete")
    public R delete(@RequestBody Long[] ids){
		qesTypeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
