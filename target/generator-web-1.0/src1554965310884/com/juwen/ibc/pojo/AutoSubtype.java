package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoSubtype" ,description="题库题目类型表")
@Data
@SuppressWarnings("serial")
public class AutoSubtype {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="题目类型名称")
    private String name;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}