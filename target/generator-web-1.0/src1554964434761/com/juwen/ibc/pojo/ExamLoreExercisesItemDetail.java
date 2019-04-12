package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="考试大纲对应的章节细节表")
@Data
@SuppressWarnings("serial")
public class ExamLoreExercisesItemDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="考试大纲对应的章节id")
    private Integer examLoreExercisesItemId;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="修改时间")
    private Date updatedAt;

    @ApiModelProperty(value="分数")
    private Float score;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="老系统id")
    private String examLoreExercisesItemNewId;
}