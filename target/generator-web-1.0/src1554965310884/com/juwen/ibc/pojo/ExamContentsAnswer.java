package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamContentsAnswer" ,description="�ı�������Ŀ�𰸱�")
@Data
@SuppressWarnings("serial")
public class ExamContentsAnswer {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�����id")
    private Integer examQuestionBankId;

    @ApiModelProperty(value="������")
    private Integer answerType;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String examQuestionBankNewId;

    @ApiModelProperty(value="��")
    private String answer;
}