package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamContentsAnswer" ,description="文本类型题目答案表")
@Data
@SuppressWarnings("serial")
public class ExamContentsAnswer {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="试题库id")
    private Integer examQuestionBankId;

    @ApiModelProperty(value="答案类型")
    private Integer answerType;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="老系统id")
    private String examQuestionBankNewId;

    @ApiModelProperty(value="答案")
    private String answer;
}