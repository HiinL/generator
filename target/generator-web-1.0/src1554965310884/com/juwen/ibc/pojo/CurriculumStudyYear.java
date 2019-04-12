package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="CurriculumStudyYear" ,description="科目学年表")
@Data
@SuppressWarnings("serial")
public class CurriculumStudyYear {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer curriculumId;

    @ApiModelProperty(value="")
    private Integer studyYearId;
}