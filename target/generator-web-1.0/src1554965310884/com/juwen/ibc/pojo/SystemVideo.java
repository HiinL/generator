package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemVideo" ,description="ϵͳ��Ƶ��")
@Data
@SuppressWarnings("serial")
public class SystemVideo {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String name;

    @ApiModelProperty(value="�۸�")
    private BigDecimal price;

    @ApiModelProperty(value="�Ƿ���ۣ�0:������,1:����")
    private Integer forSale;

    @ApiModelProperty(value="ϵͳ��Ƶurl")
    private String previewUrl;

    @ApiModelProperty(value="��ƵͼƬurl")
    private String imageUrl;

    @ApiModelProperty(value="����")
    private String descrptions;

    @ApiModelProperty(value="������")
    private String operatorName;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}