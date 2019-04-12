package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SendMessageLogs" ,description="短信发送日志表")
@Data
@SuppressWarnings("serial")
public class SendMessageLogs {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="手机号")
    private String mobileNo;

    @ApiModelProperty(value="发送时间")
    private Date sendDate;

    @ApiModelProperty(value="备注")
    private String remark;

    @ApiModelProperty(value="ip地址")
    private String ipAddress;

    @ApiModelProperty(value="设备号")
    private String deviceNo;

    @ApiModelProperty(value="验证码")
    private String code;

    @ApiModelProperty(value="状态，1：可用，2：冻结")
    private Integer status;
}