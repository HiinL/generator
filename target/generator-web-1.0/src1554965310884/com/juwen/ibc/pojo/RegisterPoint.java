package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="RegisterPoint" ,description="ѧ��ע�����Ϣ��")
@Data
@SuppressWarnings("serial")
public class RegisterPoint {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String name;

    @ApiModelProperty(value="����")
    private String descriptions;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;
}