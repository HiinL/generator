package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="�ͻ���")
@Data
@SuppressWarnings("serial")
public class Customers {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�ͻ�����")
    private String name;

    @ApiModelProperty(value="��ϵ��ʽ")
    private String mobileNo;

    @ApiModelProperty(value="�ͻ������׶�״̬")
    private Integer crmStageId;

    @ApiModelProperty(value="�ͻ�������Դ��ʽ��Դ")
    private Integer crmFromTypeId;

    @ApiModelProperty(value="�ͻ�״̬ 0:�ͻ�״̬,1:�ѳ�Ϊѧ��״̬")
    private Integer customerStatus;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ʦ�û�ID")
    private Integer adminId;

    @ApiModelProperty(value="�ͻ��������")
    private String descriptions;
}