package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamQuestionBankOptions" ,description="考试题库的选项表")
@Data
@SuppressWarnings("serial")
public class ExamQuestionBankOptions {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="真题id")
    private Integer examQuestionBankId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="老系统id")
    private String examQuestionBankNewId;

    @ApiModelProperty(value="内容")
    private String contents;
}