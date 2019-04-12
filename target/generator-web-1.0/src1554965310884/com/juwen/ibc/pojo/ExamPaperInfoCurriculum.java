package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamPaperInfoCurriculum" ,description="试卷与科目关系表")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfoCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="考试试卷id")
    private Integer examPaperInfoId;

    @ApiModelProperty(value="科目id")
    private Integer curriculumId;

    @ApiModelProperty(value="老系统id")
    private String examPaperInfoNewId;

    @ApiModelProperty(value="老系统id")
    private String curriculumNewId;
}