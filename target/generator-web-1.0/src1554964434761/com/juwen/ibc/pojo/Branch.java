package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="分支站点表")
@Data
@SuppressWarnings("serial")
public class Branch {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="名称")
    private String name;

    @ApiModelProperty(value="添加人员id")
    private Integer adminId;

    @ApiModelProperty(value="联系人")
    private String contactPerson;

    @ApiModelProperty(value="联系电话")
    private String contactPhone;

    @ApiModelProperty(value="联系地址")
    private String contactAddress;

    @ApiModelProperty(value="备注")
    private String remark;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}