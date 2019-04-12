package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value= ,description="考试大纲对应的章节表")
public class ExamLoreExercisesItemWithBLOBs extends ExamLoreExercisesItem {
    @ApiModelProperty(value="标题")
    private String title;

    @ApiModelProperty(value="描述")
    private String description;
}