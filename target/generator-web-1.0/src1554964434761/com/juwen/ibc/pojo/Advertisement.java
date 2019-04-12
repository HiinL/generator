package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="广告表")
@Data
@SuppressWarnings("serial")
public class Advertisement {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="名称")
    private String advName;

    @ApiModelProperty(value="图片")
    private String advPic;

    @ApiModelProperty(value="描述")
    private String advDesc;

    @ApiModelProperty(value="是否删除 0未删除 1删除")
    private Integer isDeleted;

    @ApiModelProperty(value="类型，0")
    private String advType;

    @ApiModelProperty(value="位置，0:pc,1：app")
    private String advPlace;

    @ApiModelProperty(value="关联业务id")
    private Integer bussinessId;

    @ApiModelProperty(value="浏览总人数")
    private Integer viewerNum;

    @ApiModelProperty(value="排序")
    private Integer listOrder;

    @ApiModelProperty(value="发布时间")
    private Date publishAt;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="备注信息")
    private String remarks;

    @ApiModelProperty(value="第三方提供的广告业链接")
    private String advUrl;
}