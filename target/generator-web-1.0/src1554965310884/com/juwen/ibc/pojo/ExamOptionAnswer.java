package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamOptionAnswer" ,description="��������Ŀ�𰸱�")
@Data
@SuppressWarnings("serial")
public class ExamOptionAnswer {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����id")
    private Integer examQuestionBankId;

    @ApiModelProperty(value="��������ѡ��id")
    private Integer examQuestionBankOptionsId;

    @ApiModelProperty(value="��ϵͳid")
    private String examQuestionBankNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String examQuestionBankOptionsNewId;
}