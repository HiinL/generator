package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentNotice" ,description="学生通知关系")
@Data
@SuppressWarnings("serial")
public class StudentNotice {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="通知id")
    private Integer noticesId;

    @ApiModelProperty(value="状态:0未读 ,1已读,2删除")
    private Integer status;
}