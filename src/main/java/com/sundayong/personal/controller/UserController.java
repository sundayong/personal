package com.sundayong.personal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "用户相关接口", description = "提供用户相关的Rest API")
public class UserController {

    @ApiOperation("获取用户列表")
    @GetMapping("/userList")
    public Object userList(){

    }
}
