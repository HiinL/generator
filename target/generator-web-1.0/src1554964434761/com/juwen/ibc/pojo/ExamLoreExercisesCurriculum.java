package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="���Դ�����Ŀ��ϵ��")
@Data
@SuppressWarnings("serial")
public class ExamLoreExercisesCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="���Դ��id")
    private Integer examLoreExercisesId;

    @ApiModelProperty(value="��Ŀid")
    private Integer curriculumId;

    @ApiModelProperty(value="��ϵͳid")
    private String examLoreExercisesNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String curriculumNewId;
}