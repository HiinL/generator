package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemStudentFileDataProfession" ,description="ѧ��������רҵ��ϵ��")
@Data
@SuppressWarnings("serial")
public class SystemStudentFileDataProfession {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧϰ����id")
    private Integer systemStudentFileDataId;

    @ApiModelProperty(value="רҵid")
    private Integer professionId;

    @ApiModelProperty(value="��ϵͳid")
    private String systemStudentFileDataNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;
}