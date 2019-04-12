package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="考试大纲与专业关系表")
@Data
@SuppressWarnings("serial")
public class ExamLoreExercisesProfession {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="考试大纲id")
    private Integer examLoreExercisesId;

    @ApiModelProperty(value="专业id")
    private Integer professionId;

    @ApiModelProperty(value="老系统id")
    private String examLoreExercisesNewId;

    @ApiModelProperty(value="老系统id")
    private String professionNewId;
}