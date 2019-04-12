package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoAnswer" ,description="题目选项表")
@Data
@SuppressWarnings("serial")
public class AutoAnswer {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="题目id")
    private Integer autoSubjectId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="选项名称")
    private String name;
}