package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamPaperInfoQuestion" ,description="�������Ծ������ϵ��")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfoQuestion {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�����Ծ���Ϣ��������id")
    private Integer examPaperInfoQuestionTypeId;

    @ApiModelProperty(value="����id")
    private Integer examQuestionBankId;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ϵͳid")
    private String examPaperInfoQuestionTypeNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String examQuestionBankNewId;
}