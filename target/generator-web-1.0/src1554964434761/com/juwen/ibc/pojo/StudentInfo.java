package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="学生信息表")
@Data
@SuppressWarnings("serial")
public class StudentInfo {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生姓名")
    private String name;

    @ApiModelProperty(value="身份证号")
    private String cardNumber;

    @ApiModelProperty(value="考籍号")
    private String examNumber;

    @ApiModelProperty(value="密码")
    private String password;

    @ApiModelProperty(value="招生老师人员id")
    private Integer adminId;

    @ApiModelProperty(value="班级id")
    private Integer classesId;

    @ApiModelProperty(value="所属专业id")
    private Integer professionalId;

    @ApiModelProperty(value="所属学校id")
    private Integer schoolId;

    @ApiModelProperty(value="学生报考类别id")
    private Integer categoryId;

    @ApiModelProperty(value="分支站点id")
    private Integer branchId;

    @ApiModelProperty(value="学生状态id")
    private Integer studentStatusId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="学生对老师的评价")
    private String teacherComment;

    @ApiModelProperty(value="老师评分")
    private String teacherScore;

    @ApiModelProperty(value="")
    private String token;
}