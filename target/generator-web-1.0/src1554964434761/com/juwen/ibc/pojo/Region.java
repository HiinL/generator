package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="")
@Data
@SuppressWarnings("serial")
public class Region {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String code;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private Integer parentId;

    @ApiModelProperty(value="")
    private Integer level;

    @ApiModelProperty(value="")
    private Integer listOrder;

    @ApiModelProperty(value="")
    private String nameEn;

    @ApiModelProperty(value="")
    private String shortnameEn;
}