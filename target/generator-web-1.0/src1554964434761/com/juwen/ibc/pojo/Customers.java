package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="客户表")
@Data
@SuppressWarnings("serial")
public class Customers {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="客户姓名")
    private String name;

    @ApiModelProperty(value="联系方式")
    private String mobileNo;

    @ApiModelProperty(value="客户招生阶段状态")
    private Integer crmStageId;

    @ApiModelProperty(value="客户招生来源方式来源")
    private Integer crmFromTypeId;

    @ApiModelProperty(value="客户状态 0:客户状态,1:已成为学生状态")
    private Integer customerStatus;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="老师用户ID")
    private Integer adminId;

    @ApiModelProperty(value="客户情况描述")
    private String descriptions;
}