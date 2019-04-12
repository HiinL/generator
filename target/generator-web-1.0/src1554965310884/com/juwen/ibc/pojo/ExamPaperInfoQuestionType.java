package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamPaperInfoQuestionType" ,description="�����Ծ������ͱ�")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfoQuestionType {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�����������id")
    private Integer examQuestionBankTypeId;

    @ApiModelProperty(value="�����Ծ�id")
    private Integer examPaperInfoId;

    @ApiModelProperty(value="����")
    private String name;

    @ApiModelProperty(value="����")
    private Integer score;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String examPaperInfoNewId;
}