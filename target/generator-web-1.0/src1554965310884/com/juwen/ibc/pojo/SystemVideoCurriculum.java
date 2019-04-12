package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemVideoCurriculum" ,description="系统视频所属科目关系表")
@Data
@SuppressWarnings("serial")
public class SystemVideoCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="系统视频id")
    private Integer systemVideoId;

    @ApiModelProperty(value="")
    private Integer curriculumId;
}