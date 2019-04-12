package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamPaperInfoQuestion" ,description="真题与试卷问题关系表")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfoQuestion {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="考试试卷信息问题类型id")
    private Integer examPaperInfoQuestionTypeId;

    @ApiModelProperty(value="真题id")
    private Integer examQuestionBankId;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="老系统id")
    private String examPaperInfoQuestionTypeNewId;

    @ApiModelProperty(value="老系统id")
    private String examQuestionBankNewId;
}