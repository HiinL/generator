package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoSubjectAnswer" ,description="��Ŀ�𰸹�ϵ��")
@Data
@SuppressWarnings("serial")
public class AutoSubjectAnswer {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="��Ŀid")
    private Integer autoSubjectId;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��Ŀ������")
    private String name;
}