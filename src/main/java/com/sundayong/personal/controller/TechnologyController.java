package com.sundayong.personal.controller;

import com.sundayong.personal.service.TechnologyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "技术类别接口", description = "技术类别接口")
@RestController
@RequestMapping("/technology")
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    @ApiOperation("获取技术类别列表")
    @GetMapping("/technologyList")
    public Object technologyList() {
        return technologyService.technologyList();
    }

}
