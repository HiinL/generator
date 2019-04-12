package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="真题库表")
@Data
@SuppressWarnings("serial")
public class ExamQuestionBank {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="父类id")
    private Integer parentId;

    @ApiModelProperty(value="题库类型id")
    private Integer examQuestionBankTypeId;

    @ApiModelProperty(value="难度 1:低难度 2:中难度 3:高难度")
    private Integer difficultyId;

    @ApiModelProperty(value="作者")
    private String author;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="老系统id")
    private String parentNewId;
}