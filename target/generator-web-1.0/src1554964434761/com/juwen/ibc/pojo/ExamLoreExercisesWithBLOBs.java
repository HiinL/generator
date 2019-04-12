package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value= ,description="考试大纲表")
public class ExamLoreExercisesWithBLOBs extends ExamLoreExercises {
    @ApiModelProperty(value="标题")
    private String title;

    @ApiModelProperty(value="描述")
    private String description;
}