package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="EvaluationCurriculumPaper" ,description="阶段性综合测试试卷和科目的关系表")
@Data
@SuppressWarnings("serial")
public class EvaluationCurriculumPaper {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="课程编号")
    private String curriculumCode;

    @ApiModelProperty(value="试卷id")
    private Integer paperId;

    @ApiModelProperty(value="专业id")
    private Integer professionId;

    @ApiModelProperty(value="老系统id")
    private String paperNewId;

    @ApiModelProperty(value="老系统id")
    private String professionNewId;
}