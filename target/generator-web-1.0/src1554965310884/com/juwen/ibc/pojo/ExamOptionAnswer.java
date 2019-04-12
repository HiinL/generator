package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamOptionAnswer" ,description="真题题题目答案表")
@Data
@SuppressWarnings("serial")
public class ExamOptionAnswer {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="真题id")
    private Integer examQuestionBankId;

    @ApiModelProperty(value="考试题库的选项id")
    private Integer examQuestionBankOptionsId;

    @ApiModelProperty(value="老系统id")
    private String examQuestionBankNewId;

    @ApiModelProperty(value="老系统id")
    private String examQuestionBankOptionsNewId;
}