package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="RoleFunctions" ,description="��ɫ���ܹ�ϵ��")
@Data
@SuppressWarnings("serial")
public class RoleFunctions {
    @ApiModelProperty(value="��ɫid")
    private Integer roleId;

    @ApiModelProperty(value="����id")
    private Integer functionId;

    @ApiModelProperty(value="����ʱ��")
    private Date createdAt;

    @ApiModelProperty(value="������")
    private String createdMan;

    @ApiModelProperty(value="�޸�ʱ��")
    private Date updatedAt;

    @ApiModelProperty(value="�޸���")
    private String updatedMan;
}