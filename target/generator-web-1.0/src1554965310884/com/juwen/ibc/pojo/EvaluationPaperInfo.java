package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="EvaluationPaperInfo" ,description="阶段性测试试卷表")
@Data
@SuppressWarnings("serial")
public class EvaluationPaperInfo {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="测试题目类型")
    private Integer autoSubtype;

    @ApiModelProperty(value="备注")
    private String remark;

    @ApiModelProperty(value="试卷id")
    private Integer paperId;

    @ApiModelProperty(value="题目id")
    private Integer autoSubjectId;

    @ApiModelProperty(value="课程编号")
    private String curriculumCode;

    @ApiModelProperty(value="专业id")
    private Integer professionId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="老系统id")
    private String paperNewId;

    @ApiModelProperty(value="老系统id")
    private String professionNewId;
}