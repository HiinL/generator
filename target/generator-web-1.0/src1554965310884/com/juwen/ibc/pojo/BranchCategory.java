package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="BranchCategory" ,description="��֧վ����ѧ����������ϵ��")
@Data
@SuppressWarnings("serial")
public class BranchCategory {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="��֧վ��id")
    private Integer branchId;

    @ApiModelProperty(value="ѧ���������id")
    private Integer categoryId;
}