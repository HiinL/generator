package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamPaperInfoQuestionType" ,description="真题试卷题型型表")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfoQuestionType {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="考试题库类型id")
    private Integer examQuestionBankTypeId;

    @ApiModelProperty(value="考试试卷id")
    private Integer examPaperInfoId;

    @ApiModelProperty(value="名称")
    private String name;

    @ApiModelProperty(value="分数")
    private Integer score;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="老系统id")
    private String examPaperInfoNewId;
}