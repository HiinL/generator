package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemStudentFileDataProfession" ,description="学生资料与专业关系表")
@Data
@SuppressWarnings("serial")
public class SystemStudentFileDataProfession {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学习资料id")
    private Integer systemStudentFileDataId;

    @ApiModelProperty(value="专业id")
    private Integer professionId;

    @ApiModelProperty(value="老系统id")
    private String systemStudentFileDataNewId;

    @ApiModelProperty(value="老系统id")
    private String professionNewId;
}