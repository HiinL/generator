package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoSubjectDetail" ,description="题目解析详情表")
@Data
@SuppressWarnings("serial")
public class AutoSubjectDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="题目id")
    private Integer autoSubjectId;

    @ApiModelProperty(value="题目类型id")
    private Integer autoSubtypeId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}