package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="������ͱ�")
@Data
@SuppressWarnings("serial")
public class ExamQuestionBankType {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String name;

    @ApiModelProperty(value="����(������,��֪�Ƿ����ã�)")
    private Integer type;

    @ApiModelProperty(value="��ע����")
    private String descriptions;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;
}