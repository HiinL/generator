package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoSubtype" ,description="�����Ŀ���ͱ�")
@Data
@SuppressWarnings("serial")
public class AutoSubtype {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="��Ŀ��������")
    private String name;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}