package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="后台员工表")
@Data
@SuppressWarnings("serial")
public class Admins {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="员工手机号")
    private String mobileNo;

    @ApiModelProperty(value="员工姓名")
    private String userName;

    @ApiModelProperty(value="员工密码")
    private String password;

    @ApiModelProperty(value="所属分支站点id")
    private Integer branchId;

    @ApiModelProperty(value="状态，1：可用，2：冻结")
    private Integer status;

    @ApiModelProperty(value="性别(0:女 1:男)")
    private String sex;

    @ApiModelProperty(value="操作ip地址")
    private String operatorIp;

    @ApiModelProperty(value="排序")
    private Integer listOrder;

    @ApiModelProperty(value="操作人id")
    private Integer opId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="修改时间")
    private Date updatedAt;

    @ApiModelProperty(value="修改人")
    private String updatedMan;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="创建人")
    private String createdMan;

    @ApiModelProperty(value="")
    private Double score;

    @ApiModelProperty(value="")
    private String qq;

    @ApiModelProperty(value="头像")
    private String picFace;
}