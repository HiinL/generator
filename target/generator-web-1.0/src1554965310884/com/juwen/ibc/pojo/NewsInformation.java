package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="NewsInformation" ,description="新闻资讯表")
@Data
@SuppressWarnings("serial")
public class NewsInformation {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="标题")
    private String title;

    @ApiModelProperty(value="作者")
    private String author;

    @ApiModelProperty(value="状态，1：可用，2：冻结")
    private Integer status;

    @ApiModelProperty(value="类型，0")
    private String type;

    @ApiModelProperty(value="浏览总人数")
    private Integer viewerNum;

    @ApiModelProperty(value="排序")
    private Integer listOrder;

    @ApiModelProperty(value="发布时间")
    private Date publishAt;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="第三方提供的广告业链接")
    private String thirdUrl;

    @ApiModelProperty(value="内容")
    private String contents;
}