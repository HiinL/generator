package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="视频播放记录表")
@Data
@SuppressWarnings("serial")
public class SystemVideoPlayRecord {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="播放时长：时间戳，精确到秒，0可以表示从未播放过")
    private Integer playDuration;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="更新时间")
    private Date updateAt;

    @ApiModelProperty(value="上次播放时间")
    private Date lastPlayTime;

    @ApiModelProperty(value="视频id")
    private Integer systemVideoId;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="单个视频的id")
    private Integer systemVideoDetailId;
}