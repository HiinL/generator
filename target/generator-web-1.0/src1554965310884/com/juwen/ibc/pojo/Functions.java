package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="Functions" ,description="菜单功能表")
@Data
@SuppressWarnings("serial")
public class Functions {
    @ApiModelProperty(value="功能id")
    private Integer id;

    @ApiModelProperty(value="功能名称")
    private String name;

    @ApiModelProperty(value="父功能ID")
    private Integer parentId;

    @ApiModelProperty(value="功能地址")
    private String url;

    @ApiModelProperty(value="类型：1:菜单，2按钮")
    private Integer type;

    @ApiModelProperty(value="状态，1：可用，2：冻结")
    private Integer status;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="备注")
    private String remarks;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="创建人")
    private String createdMan;

    @ApiModelProperty(value="修改时间")
    private Date updatedAt;

    @ApiModelProperty(value="修改人")
    private String updatedMan;
}