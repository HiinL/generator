package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamPaperInfoCurriculum" ,description="�Ծ����Ŀ��ϵ��")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfoCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�����Ծ�id")
    private Integer examPaperInfoId;

    @ApiModelProperty(value="��Ŀid")
    private Integer curriculumId;

    @ApiModelProperty(value="��ϵͳid")
    private String examPaperInfoNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String curriculumNewId;
}