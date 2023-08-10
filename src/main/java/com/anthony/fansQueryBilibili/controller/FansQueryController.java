package com.anthony.fansQueryBilibili.controller;

import com.anthony.fansQueryBilibili.service.FansQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/fansQuery")
@RestController
public class FansQueryController {

    @Resource
    private FansQueryService fansQueryService;

    @GetMapping("/all")
    public void FansQuery() throws Exception {
        fansQueryService.fansQuery();
    }
}
