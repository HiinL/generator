package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="רҵ��ѧУ��")
@Data
@SuppressWarnings("serial")
public class ProfessionSchool {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="רҵid")
    private Integer professionId;

    @ApiModelProperty(value="ѧУid")
    private Integer schoolId;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String schoolNewId;
}