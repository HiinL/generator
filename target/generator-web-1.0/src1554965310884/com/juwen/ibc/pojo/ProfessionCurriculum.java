package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ProfessionCurriculum" ,description="רҵ�Ϳ�Ŀ��")
@Data
@SuppressWarnings("serial")
public class ProfessionCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer professionId;

    @ApiModelProperty(value="")
    private Integer curriculumId;

    @ApiModelProperty(value="����")
    private Integer type;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String curriculumNewId;
}