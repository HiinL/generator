package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="��¼��־��")
@Data
@SuppressWarnings("serial")
public class LoginLog {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="��¼ʱ��")
    private Date loginAt;

    @ApiModelProperty(value="ip��ַ")
    private String ipAddress;

    @ApiModelProperty(value="��¼��Դ��pc��android��ios")
    private String client;
}