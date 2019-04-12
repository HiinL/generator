package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="Category" ,description="ѧ����������")
@Data
@SuppressWarnings("serial")
public class Category {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ�������������")
    private String name;

    @ApiModelProperty(value="ѧ�������������")
    private String description;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}