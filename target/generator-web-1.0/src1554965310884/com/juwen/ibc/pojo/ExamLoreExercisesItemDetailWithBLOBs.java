package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="ExamLoreExercisesItemDetailWithBLOBs" ,description="���Դ�ٶ�Ӧ���½�ϸ�ڱ�")
public class ExamLoreExercisesItemDetailWithBLOBs extends ExamLoreExercisesItemDetail {
    @ApiModelProperty(value="��������")
    private String title;

    @ApiModelProperty(value="����")
    private String contents;

    @ApiModelProperty(value="����")
    private String analysis;

    @ApiModelProperty(value="����")
    private String question;

    @ApiModelProperty(value="��")
    private String answer;
}