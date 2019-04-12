package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="BranchCategory" ,description="分支站点与学生报考类别关系表")
@Data
@SuppressWarnings("serial")
public class BranchCategory {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="分支站点id")
    private Integer branchId;

    @ApiModelProperty(value="学生报考类别id")
    private Integer categoryId;
}