package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoSubjectStudentAnswerProgress" ,description="题库练习之学生答题进度")
@Data
@SuppressWarnings("serial")
public class AutoSubjectStudentAnswerProgress {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="答题的学生")
    private Integer studentId;

    @ApiModelProperty(value="科目id")
    private Integer curriculumId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="更新时间")
    private Date updateAt;

    @ApiModelProperty(value="当前最后一题的题目位置")
    private Integer lastAnswerIndex;

    @ApiModelProperty(value="题库练习的类型id")
    private Integer autoSubtypeId;
}