package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AdminRoles" ,description="员工角色关系表")
@Data
@SuppressWarnings("serial")
public class AdminRoles {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="员工ID")
    private Integer adminId;

    @ApiModelProperty(value="角色ID")
    private Integer roleId;

    @ApiModelProperty(value="创建时间")
    private Date createdAt;

    @ApiModelProperty(value="创建人")
    private String createdMan;

    @ApiModelProperty(value="修改时间")
    private Date updatedAt;

    @ApiModelProperty(value="修改人")
    private String updatedMan;
}