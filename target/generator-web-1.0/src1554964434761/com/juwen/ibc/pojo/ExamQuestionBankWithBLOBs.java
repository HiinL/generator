package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value= ,description="真题库表")
public class ExamQuestionBankWithBLOBs extends ExamQuestionBank {
    @ApiModelProperty(value="内容")
    private String contents;

    @ApiModelProperty(value="描述题目解析")
    private String descriptions;
}