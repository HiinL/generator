package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AppVersion" ,description="app版本更新表")
@Data
@SuppressWarnings("serial")
public class AppVersion {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="版本号")
    private String code;

    @ApiModelProperty(value="更新描述ps分号隔开")
    private String description;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="客户端类型1:android 2:ios")
    private Integer clientType;

    @ApiModelProperty(value="下载地址")
    private String downloadUrl;

    @ApiModelProperty(value="更新类型，0不强制更新，1强制更新")
    private String updateType;
}