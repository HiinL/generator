package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ϵͳ��Ϣ֪ͨ��")
@Data
@SuppressWarnings("serial")
public class SystemMessage {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String title;

    @ApiModelProperty(value="��ϸ����")
    private String detail;

    @ApiModelProperty(value="���ͣ�1:ϵͳ���� 2:����(վ��) 3:������ʦ 4:ѧ�� 5:�ɼ����� 6:�������� 7:������Ϣ")
    private Integer type;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="����ҵ��id")
    private Integer bussinessId;

    @ApiModelProperty(value="��Ϣ�Ƿ��Ѷ��� Ĭ��0Ϊ��Ϣĩ����1Ϊ��Ϣ�Ѷ�")
    private Integer readStatus;

    @ApiModelProperty(value="��֧վ��id")
    private Integer branchId;

    @ApiModelProperty(value="��������")
    private Integer batchId;

    @ApiModelProperty(value="ѧ���������id")
    private Integer categoryId;

    @ApiModelProperty(value="�������")
    private Integer educational;

    @ApiModelProperty(value="����ѧУid")
    private Integer schoolId;

    @ApiModelProperty(value="����רҵid")
    private Integer professionalId;

    @ApiModelProperty(value="ѧ��״̬id")
    private Integer studentStatusId;

    @ApiModelProperty(value="�û�id")
    private Integer adminId;
}