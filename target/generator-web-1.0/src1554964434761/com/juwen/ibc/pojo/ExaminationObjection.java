package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="�ҵ������")
@Data
@SuppressWarnings("serial")
public class ExaminationObjection {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="���1�ɼ����飻2��������")
    private Integer type;

    @ApiModelProperty(value="����ԭ��")
    private String objectionContent;

    @ApiModelProperty(value="����ҵ��id(�ɼ����鱨������)")
    private Integer bussinessId;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="����״̬ 1ĩ�����2�ѽ����3������")
    private Integer objectionStatus;

    @ApiModelProperty(value="��Ϣ����id")
    private Integer systemMessageId;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="��ʦid")
    private Integer adminId;

    @ApiModelProperty(value="��֧վ��id")
    private Integer branchId;
}