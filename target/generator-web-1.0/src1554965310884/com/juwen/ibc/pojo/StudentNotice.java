package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentNotice" ,description="ѧ��֪ͨ��ϵ")
@Data
@SuppressWarnings("serial")
public class StudentNotice {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="֪ͨid")
    private Integer noticesId;

    @ApiModelProperty(value="״̬:0δ�� ,1�Ѷ�,2ɾ��")
    private Integer status;
}