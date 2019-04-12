package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="EvaluationType" ,description="阶段测试类型表")
@Data
@SuppressWarnings("serial")
public class EvaluationType {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="类型")
    private Integer type;

    @ApiModelProperty(value="名称")
    private String name;
}