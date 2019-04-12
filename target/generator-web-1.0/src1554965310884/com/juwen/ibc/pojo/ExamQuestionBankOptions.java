package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamQuestionBankOptions" ,description="��������ѡ���")
@Data
@SuppressWarnings("serial")
public class ExamQuestionBankOptions {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����id")
    private Integer examQuestionBankId;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String examQuestionBankNewId;

    @ApiModelProperty(value="����")
    private String contents;
}