package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ѧϰ�������Ŀ��ϵ��")
@Data
@SuppressWarnings("serial")
public class SystemStudentFileDataCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧϰ����id")
    private Integer systemStudentFileDataId;

    @ApiModelProperty(value="��Ŀid")
    private Integer curriculumId;

    @ApiModelProperty(value="��ϵͳid")
    private String systemStudentFileDataNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String curriculumNewId;
}