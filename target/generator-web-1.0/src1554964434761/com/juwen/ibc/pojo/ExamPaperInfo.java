package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="考试试卷信息表")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfo {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="标题")
    private String title;

    @ApiModelProperty(value="缩略标题")
    private String subTitle;

    @ApiModelProperty(value="考试时长")
    private Integer examMinutes;

    @ApiModelProperty(value="考试总分")
    private Integer examTotalScore;

    @ApiModelProperty(value="考试及格分")
    private Integer examPassScore;

    @ApiModelProperty(value="类型,1:模拟考试 2:网上作业 3:章节练习")
    private Integer type;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="备注")
    private String descriptions;
}