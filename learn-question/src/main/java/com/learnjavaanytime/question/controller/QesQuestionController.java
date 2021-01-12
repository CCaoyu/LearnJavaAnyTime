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

import com.learnjavaanytime.question.entity.QesQuestionEntity;
import com.learnjavaanytime.question.service.QesQuestionService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.common.utils.R;

//import org.apache.shiro.authz.annotation.RequiresPermissions;



/**
 * 
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-12 17:13:20
 */
@RestController
@RequestMapping("question/qesquestion")
public class QesQuestionController {
    @Autowired
    private QesQuestionService qesQuestionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("question:qesquestion:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qesQuestionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("question:qesquestion:info")
    public R info(@PathVariable("id") Long id){
		QesQuestionEntity qesQuestion = qesQuestionService.getById(id);

        return R.ok().put("qesQuestion", qesQuestion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("question:qesquestion:save")
    public R save(@RequestBody QesQuestionEntity qesQuestion){
		qesQuestionService.save(qesQuestion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("question:qesquestion:update")
    public R update(@RequestBody QesQuestionEntity qesQuestion){
		qesQuestionService.updateById(qesQuestion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("question:qesquestion:delete")
    public R delete(@RequestBody Long[] ids){
		qesQuestionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
