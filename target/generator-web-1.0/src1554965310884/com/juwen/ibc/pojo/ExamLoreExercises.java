package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamLoreExercises" ,description="考试大纲表")
@Data
@SuppressWarnings("serial")
public class ExamLoreExercises {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="作者")
    private String author;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="修改时间")
    private Date updatedAt;

    @ApiModelProperty(value="缩略图")
    private String thumbnail;

    @ApiModelProperty(value="老系统id")
    private String newId;
}