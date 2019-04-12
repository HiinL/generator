package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="系统视频详细表")
@Data
@SuppressWarnings("serial")
public class SystemVideoDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="系统视频id")
    private Integer systemVideoId;

    @ApiModelProperty(value="视频名称")
    private String name;

    @ApiModelProperty(value="视频地址")
    private String videoPath;

    @ApiModelProperty(value="缩略图地址")
    private String thumbPath;

    @ApiModelProperty(value="老师姓名")
    private String teacherName;

    @ApiModelProperty(value="视频时长")
    private String duration;

    @ApiModelProperty(value="操作人")
    private String operatorName;

    @ApiModelProperty(value="描述备注")
    private String descriptions;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="累计浏览量")
    private Integer viewerCount;

    @ApiModelProperty(value="累计浏览量（真实数据）")
    private Integer realViewerCount;
}