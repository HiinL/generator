package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="角色表")
@Data
@SuppressWarnings("serial")
public class Roles {
    @ApiModelProperty(value="角色id")
    private Integer id;

    @ApiModelProperty(value="角色名称")
    private String name;

    @ApiModelProperty(value="角色描述")
    private String description;

    @ApiModelProperty(value="部门ID")
    private Integer deptId;

    @ApiModelProperty(value="状态，1：可用，2：冻结")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="创建人")
    private String createdMan;

    @ApiModelProperty(value="修改时间")
    private Date updatedAt;

    @ApiModelProperty(value="修改人")
    private String updatedMan;
}