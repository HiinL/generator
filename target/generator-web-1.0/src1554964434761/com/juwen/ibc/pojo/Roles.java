package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="��ɫ��")
@Data
@SuppressWarnings("serial")
public class Roles {
    @ApiModelProperty(value="��ɫid")
    private Integer id;

    @ApiModelProperty(value="��ɫ����")
    private String name;

    @ApiModelProperty(value="��ɫ����")
    private String description;

    @ApiModelProperty(value="����ID")
    private Integer deptId;

    @ApiModelProperty(value="״̬��1�����ã�2������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="������")
    private String createdMan;

    @ApiModelProperty(value="�޸�ʱ��")
    private Date updatedAt;

    @ApiModelProperty(value="�޸���")
    private String updatedMan;
}