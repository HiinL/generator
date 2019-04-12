package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="通知公告表")
@Data
@SuppressWarnings("serial")
public class Notices {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="标题")
    private String title;

    @ApiModelProperty(value="类型")
    private Integer noticeType;

    @ApiModelProperty(value="内容")
    private String content;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}