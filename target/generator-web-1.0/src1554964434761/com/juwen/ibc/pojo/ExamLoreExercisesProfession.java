package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="���Դ����רҵ��ϵ��")
@Data
@SuppressWarnings("serial")
public class ExamLoreExercisesProfession {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="���Դ��id")
    private Integer examLoreExercisesId;

    @ApiModelProperty(value="רҵid")
    private Integer professionId;

    @ApiModelProperty(value="��ϵͳid")
    private String examLoreExercisesNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;
}