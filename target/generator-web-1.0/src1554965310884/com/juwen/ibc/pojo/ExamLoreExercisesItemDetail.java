package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamLoreExercisesItemDetail" ,description="���Դ�ٶ�Ӧ���½�ϸ�ڱ�")
@Data
@SuppressWarnings("serial")
public class ExamLoreExercisesItemDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="���Դ�ٶ�Ӧ���½�id")
    private Integer examLoreExercisesItemId;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�޸�ʱ��")
    private Date updatedAt;

    @ApiModelProperty(value="����")
    private Float score;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String examLoreExercisesItemNewId;
}