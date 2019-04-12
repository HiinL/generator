package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudyPlan" ,description="学习计划表")
@Data
@SuppressWarnings("serial")
public class StudyPlan {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="课程id")
    private Integer curriculumId;

    @ApiModelProperty(value="课程名称")
    private String curriculumName;

    @ApiModelProperty(value="课程代码")
    private String curriculumCode;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="学生账户登录名")
    private String loginName;

    @ApiModelProperty(value="类别，1必学科目；2选学科目")
    private Integer type;

    @ApiModelProperty(value="复习指南1")
    private String reviewOne;

    @ApiModelProperty(value="复习指南2")
    private String reviewTwo;

    @ApiModelProperty(value="复习指南3")
    private String reviewThree;

    @ApiModelProperty(value="适应年级说明")
    private String gradeDesc;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="所属专业id")
    private Integer professionalId;
}