package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="专业和学校表")
@Data
@SuppressWarnings("serial")
public class ProfessionSchool {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="专业id")
    private Integer professionId;

    @ApiModelProperty(value="学校id")
    private Integer schoolId;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="老系统id")
    private String professionNewId;

    @ApiModelProperty(value="老系统id")
    private String schoolNewId;
}