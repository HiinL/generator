package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemVideoCurriculum" ,description="ϵͳ��Ƶ������Ŀ��ϵ��")
@Data
@SuppressWarnings("serial")
public class SystemVideoCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ϵͳ��Ƶid")
    private Integer systemVideoId;

    @ApiModelProperty(value="")
    private Integer curriculumId;
}