package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="�Ծ���רҵ��ϵ��")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfoProfession {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�����Ծ�id")
    private Integer examPaperInfoId;

    @ApiModelProperty(value="רҵid")
    private Integer professionId;

    @ApiModelProperty(value="��ϵͳid")
    private String examPaperInfoNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;
}