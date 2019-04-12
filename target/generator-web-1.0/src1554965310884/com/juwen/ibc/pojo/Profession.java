package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="Profession" ,description="רҵ��Ϣ��")
@Data
@SuppressWarnings("serial")
public class Profession {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="רҵ����")
    private String code;

    @ApiModelProperty(value="רҵ����")
    private String name;

    @ApiModelProperty(value="����ѧ�����")
    private Integer categoryId;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}