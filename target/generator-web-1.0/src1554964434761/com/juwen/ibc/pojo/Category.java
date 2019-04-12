package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="学生报考类别表")
@Data
@SuppressWarnings("serial")
public class Category {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生报考类别名称")
    private String name;

    @ApiModelProperty(value="学生报考类别描述")
    private String description;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}