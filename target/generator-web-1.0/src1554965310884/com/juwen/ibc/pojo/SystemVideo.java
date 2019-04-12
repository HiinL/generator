package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemVideo" ,description="系统视频表")
@Data
@SuppressWarnings("serial")
public class SystemVideo {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="名称")
    private String name;

    @ApiModelProperty(value="价格")
    private BigDecimal price;

    @ApiModelProperty(value="是否出售，0:不出售,1:出售")
    private Integer forSale;

    @ApiModelProperty(value="系统视频url")
    private String previewUrl;

    @ApiModelProperty(value="视频图片url")
    private String imageUrl;

    @ApiModelProperty(value="描述")
    private String descrptions;

    @ApiModelProperty(value="操作人")
    private String operatorName;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}