package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="我的成绩表")
@Data
@SuppressWarnings("serial")
public class ExaminationScore {
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

    @ApiModelProperty(value="类别，1公共课程；2核心课程；3选考课程")
    private Integer type;

    @ApiModelProperty(value="状态 1已通过；2末通过；3末考试")
    private Integer examinationStatus;

    @ApiModelProperty(value="成绩确认状态 默认0为成绩末确认 1成绩确认")
    private Integer examinationConfirmStatus;

    @ApiModelProperty(value="成绩分数")
    private String examinationScore;

    @ApiModelProperty(value="考试时间")
    private Date examinationAt;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="更新时间")
    private Date updateAt;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="考籍号")
    private String examNumber;

    @ApiModelProperty(value="成绩异议状态 默认0为末提交异议 1已提交异议")
    private Integer objectionConfirmStatus;
}