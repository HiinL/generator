package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="学习资料与科目关系表")
@Data
@SuppressWarnings("serial")
public class SystemStudentFileDataCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学习资料id")
    private Integer systemStudentFileDataId;

    @ApiModelProperty(value="科目id")
    private Integer curriculumId;

    @ApiModelProperty(value="老系统id")
    private String systemStudentFileDataNewId;

    @ApiModelProperty(value="老系统id")
    private String curriculumNewId;
}