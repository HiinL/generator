package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="我的异议表")
@Data
@SuppressWarnings("serial")
public class ExaminationObjection {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="类别，1成绩异议；2报考异议")
    private Integer type;

    @ApiModelProperty(value="异议原因")
    private String objectionContent;

    @ApiModelProperty(value="关联业务id(成绩异议报考异议)")
    private Integer bussinessId;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="异议状态 1末解决；2已解决；3已提醒")
    private Integer objectionStatus;

    @ApiModelProperty(value="消息提醒id")
    private Integer systemMessageId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="老师id")
    private Integer adminId;

    @ApiModelProperty(value="分支站点id")
    private Integer branchId;
}