package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="����")
@Data
@SuppressWarnings("serial")
public class Advertisement {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="����")
    private String advName;

    @ApiModelProperty(value="ͼƬ")
    private String advPic;

    @ApiModelProperty(value="����")
    private String advDesc;

    @ApiModelProperty(value="�Ƿ�ɾ�� 0δɾ�� 1ɾ��")
    private Integer isDeleted;

    @ApiModelProperty(value="���ͣ�0")
    private String advType;

    @ApiModelProperty(value="λ�ã�0:pc,1��app")
    private String advPlace;

    @ApiModelProperty(value="����ҵ��id")
    private Integer bussinessId;

    @ApiModelProperty(value="���������")
    private Integer viewerNum;

    @ApiModelProperty(value="����")
    private Integer listOrder;

    @ApiModelProperty(value="����ʱ��")
    private Date publishAt;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ע��Ϣ")
    private String remarks;

    @ApiModelProperty(value="�������ṩ�Ĺ��ҵ����")
    private String advUrl;
}