package com.sundayong.personal.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户实体")
@Data
public class User {
    @ApiModelProperty("用户id")
    private String id;

    @ApiModelProperty("用户姓名")
    private String name;
}
