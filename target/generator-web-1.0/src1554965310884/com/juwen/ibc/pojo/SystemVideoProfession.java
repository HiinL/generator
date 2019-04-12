package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemVideoProfession" ,description="��Ƶ�μ�����רҵ��ϵ��")
@Data
@SuppressWarnings("serial")
public class SystemVideoProfession {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ϵͳ��Ƶid")
    private Integer systemVideoId;

    @ApiModelProperty(value="רҵid")
    private String professionId;

    @ApiModelProperty(value="��ϵͳid")
    private String systemVideoNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;
}