package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="ExamLoreExercisesItemDetailWithBLOBs" ,description="考试大纲对应的章节细节表")
public class ExamLoreExercisesItemDetailWithBLOBs extends ExamLoreExercisesItemDetail {
    @ApiModelProperty(value="标题名称")
    private String title;

    @ApiModelProperty(value="内容")
    private String contents;

    @ApiModelProperty(value="分析")
    private String analysis;

    @ApiModelProperty(value="问题")
    private String question;

    @ApiModelProperty(value="答案")
    private String answer;
}