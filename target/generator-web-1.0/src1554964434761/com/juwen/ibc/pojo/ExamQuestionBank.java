package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="������")
@Data
@SuppressWarnings("serial")
public class ExamQuestionBank {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����id")
    private Integer parentId;

    @ApiModelProperty(value="�������id")
    private Integer examQuestionBankTypeId;

    @ApiModelProperty(value="�Ѷ� 1:���Ѷ� 2:���Ѷ� 3:���Ѷ�")
    private Integer difficultyId;

    @ApiModelProperty(value="����")
    private String author;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String parentNewId;
}