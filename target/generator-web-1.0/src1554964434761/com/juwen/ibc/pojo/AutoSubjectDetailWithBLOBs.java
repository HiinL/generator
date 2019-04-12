package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value= ,description="题目解析详情表")
public class AutoSubjectDetailWithBLOBs extends AutoSubjectDetail {
    @ApiModelProperty(value="考点")
    private String examPoint;

    @ApiModelProperty(value="教材页码")
    private String pageNumber;

    @ApiModelProperty(value="题目解析")
    private String analysis;
}