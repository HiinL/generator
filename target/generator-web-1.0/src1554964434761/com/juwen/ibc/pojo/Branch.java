package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="��֧վ���")
@Data
@SuppressWarnings("serial")
public class Branch {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String name;

    @ApiModelProperty(value="�����Աid")
    private Integer adminId;

    @ApiModelProperty(value="��ϵ��")
    private String contactPerson;

    @ApiModelProperty(value="��ϵ�绰")
    private String contactPhone;

    @ApiModelProperty(value="��ϵ��ַ")
    private String contactAddress;

    @ApiModelProperty(value="��ע")
    private String remark;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}