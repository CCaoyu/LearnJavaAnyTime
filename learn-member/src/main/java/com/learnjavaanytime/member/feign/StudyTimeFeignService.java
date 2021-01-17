package com.learnjavaanytime.member.feign;

import com.learnjavaanytime.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("learn-study")
public interface StudyTimeFeignService {
    /*@RequestMapping("study/studytime/member/list/test/{id}")*/
    @RequestMapping("study/studytime/member/list/test")
    /*public R getMemberStudyTimeListTest(@PathVariable("id") Long id);*/
    public R getMemberStudyTimeListTest();
    //public R memberStudyTime();
}
