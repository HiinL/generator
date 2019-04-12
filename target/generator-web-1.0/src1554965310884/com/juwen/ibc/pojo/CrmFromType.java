package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="CrmFromType" ,description="招生来源方式表")
@Data
@SuppressWarnings("serial")
public class CrmFromType {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="名称")
    private String name;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;
}