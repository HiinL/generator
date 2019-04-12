package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="RoleFunctions" ,description="角色功能关系表")
@Data
@SuppressWarnings("serial")
public class RoleFunctions {
    @ApiModelProperty(value="角色id")
    private Integer roleId;

    @ApiModelProperty(value="功能id")
    private Integer functionId;

    @ApiModelProperty(value="创建时间")
    private Date createdAt;

    @ApiModelProperty(value="创建人")
    private String createdMan;

    @ApiModelProperty(value="修改时间")
    private Date updatedAt;

    @ApiModelProperty(value="修改人")
    private String updatedMan;
}