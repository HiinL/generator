package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="登录日志表")
@Data
@SuppressWarnings("serial")
public class LoginLog {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="登录时间")
    private Date loginAt;

    @ApiModelProperty(value="ip地址")
    private String ipAddress;

    @ApiModelProperty(value="登录来源，pc，android，ios")
    private String client;
}