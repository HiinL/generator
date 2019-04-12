package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="Curriculum" ,description="��Ŀ��")
@Data
@SuppressWarnings("serial")
public class Curriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String name;

    @ApiModelProperty(value="���ƴ���")
    private String code;

    @ApiModelProperty(value="�������id")
    private Integer categoryId;

    @ApiModelProperty(value="��Ŀ���ͣ�1�����Σ�2���ĿΣ�3ѡ���Σ�4��ҵ����")
    private Integer type;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="ѧ��")
    private Integer credits;

    @ApiModelProperty(value="�γ��ȶȣ�����ȡֵ 1��5,��������ʾ1�ǵ�5��")
    private Integer hotNumber;

    @ApiModelProperty(value="0������1��ʾ���ſγ�")
    private Byte isHot;
}