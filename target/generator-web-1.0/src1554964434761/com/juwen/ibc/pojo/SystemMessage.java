package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="系统消息通知表")
@Data
@SuppressWarnings("serial")
public class SystemMessage {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="标题")
    private String title;

    @ApiModelProperty(value="详细内容")
    private String detail;

    @ApiModelProperty(value="类型，1:系统管理 2:教务(站点) 3:招生老师 4:学生 5:成绩异议 6:报考异议 7:定制消息")
    private Integer type;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="关联业务id")
    private Integer bussinessId;

    @ApiModelProperty(value="消息是否已读， 默认0为消息末读；1为消息已读")
    private Integer readStatus;

    @ApiModelProperty(value="分支站点id")
    private Integer branchId;

    @ApiModelProperty(value="报考批次")
    private Integer batchId;

    @ApiModelProperty(value="学生报考类别id")
    private Integer categoryId;

    @ApiModelProperty(value="报考层次")
    private Integer educational;

    @ApiModelProperty(value="所属学校id")
    private Integer schoolId;

    @ApiModelProperty(value="所属专业id")
    private Integer professionalId;

    @ApiModelProperty(value="学生状态id")
    private Integer studentStatusId;

    @ApiModelProperty(value="用户id")
    private Integer adminId;
}