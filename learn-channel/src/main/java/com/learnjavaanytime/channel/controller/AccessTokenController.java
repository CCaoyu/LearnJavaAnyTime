package com.learnjavaanytime.channel.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learnjavaanytime.channel.entity.AccessTokenEntity;
import com.learnjavaanytime.channel.service.AccessTokenService;
import com.learnjavaanytime.common.utils.PageUtils;
import com.learnjavaanytime.common.utils.R;

//import org.apache.shiro.authz.annotation.RequiresPermissions;



/**
 * 渠道-认证表
 *
 * @author caoyu
 * @email 494846400@qq.com
 * @date 2021-01-17 17:36:51
 */
@RestController
@RequestMapping("channel/accesstoken")
public class AccessTokenController {
    @Autowired
    private AccessTokenService accessTokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("channel:accesstoken:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = accessTokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("channel:accesstoken:info")
    public R info(@PathVariable("id") Long id){
		AccessTokenEntity accessToken = accessTokenService.getById(id);

        return R.ok().put("accessToken", accessToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("channel:accesstoken:save")
    public R save(@RequestBody AccessTokenEntity accessToken){
		accessTokenService.save(accessToken);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("channel:accesstoken:update")
    public R update(@RequestBody AccessTokenEntity accessToken){
		accessTokenService.updateById(accessToken);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("channel:accesstoken:delete")
    public R delete(@RequestBody Long[] ids){
		accessTokenService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
