package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamLoreExercisesItem" ,description="���Դ�ٶ�Ӧ���½ڱ�")
@Data
@SuppressWarnings("serial")
public class ExamLoreExercisesItem {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�޸�ʱ��")
    private Date updatedAt;

    @ApiModelProperty(value="���Դ��id")
    private Integer examLoreExercisesId;

    @ApiModelProperty(value="�½���ϰid")
    private Integer chapterExerciseId;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String examLoreExercisesNewId;
}