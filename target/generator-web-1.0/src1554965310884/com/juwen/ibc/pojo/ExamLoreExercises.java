package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamLoreExercises" ,description="���Դ�ٱ�")
@Data
@SuppressWarnings("serial")
public class ExamLoreExercises {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String author;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�޸�ʱ��")
    private Date updatedAt;

    @ApiModelProperty(value="����ͼ")
    private String thumbnail;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;
}