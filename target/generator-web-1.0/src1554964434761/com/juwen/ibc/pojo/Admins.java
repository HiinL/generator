package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="��̨Ա����")
@Data
@SuppressWarnings("serial")
public class Admins {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="Ա���ֻ���")
    private String mobileNo;

    @ApiModelProperty(value="Ա������")
    private String userName;

    @ApiModelProperty(value="Ա������")
    private String password;

    @ApiModelProperty(value="������֧վ��id")
    private Integer branchId;

    @ApiModelProperty(value="״̬��1�����ã�2������")
    private Integer status;

    @ApiModelProperty(value="�Ա�(0:Ů 1:��)")
    private String sex;

    @ApiModelProperty(value="����ip��ַ")
    private String operatorIp;

    @ApiModelProperty(value="����")
    private Integer listOrder;

    @ApiModelProperty(value="������id")
    private Integer opId;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�޸�ʱ��")
    private Date updatedAt;

    @ApiModelProperty(value="�޸���")
    private String updatedMan;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="������")
    private String createdMan;

    @ApiModelProperty(value="")
    private Double score;

    @ApiModelProperty(value="")
    private String qq;

    @ApiModelProperty(value="ͷ��")
    private String picFace;
}