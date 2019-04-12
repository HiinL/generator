package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamUser" ,description="考试学生用户表")
@Data
@SuppressWarnings("serial")
public class ExamUser {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="真实姓名")
    private String name;

    @ApiModelProperty(value="登录名")
    private String loginName;

    @ApiModelProperty(value="密码")
    private String password;

    @ApiModelProperty(value="用户类型，1:管理员,2:老师,3:学生???(需要这么多类型？)")
    private Integer userType;

    @ApiModelProperty(value="考试出处")
    private Integer userFrom;

    @ApiModelProperty(value="?????")
    private Integer userFlag;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="老系统id")
    private String userFromNewId;

    @ApiModelProperty(value="老系统id")
    private String userFlagNewId;
}