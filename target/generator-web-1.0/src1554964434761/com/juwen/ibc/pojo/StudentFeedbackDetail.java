package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="学生反馈回复表")
@Data
@SuppressWarnings("serial")
public class StudentFeedbackDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生投诉id")
    private Integer studentFeedbackId;

    @ApiModelProperty(value="详细内容")
    private String detail;

    @ApiModelProperty(value="操作人用户id")
    private Integer operatorId;

    @ApiModelProperty(value="消息父id")
    private Integer parentId;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}