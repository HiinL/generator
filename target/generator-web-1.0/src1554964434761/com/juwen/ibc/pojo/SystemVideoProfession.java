package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="视频课件所属专业关系表")
@Data
@SuppressWarnings("serial")
public class SystemVideoProfession {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="系统视频id")
    private Integer systemVideoId;

    @ApiModelProperty(value="专业id")
    private String professionId;

    @ApiModelProperty(value="老系统id")
    private String systemVideoNewId;

    @ApiModelProperty(value="老系统id")
    private String professionNewId;
}