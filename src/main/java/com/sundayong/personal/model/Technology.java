package com.sundayong.personal.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("技术类别实体")
@Data
public class Technology {

    @ApiModelProperty("技术类别id")
    private String id;

    @ApiModelProperty("技术类别")
    private String type;

}
