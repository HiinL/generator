package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="Functions" ,description="�˵����ܱ�")
@Data
@SuppressWarnings("serial")
public class Functions {
    @ApiModelProperty(value="����id")
    private Integer id;

    @ApiModelProperty(value="��������")
    private String name;

    @ApiModelProperty(value="������ID")
    private Integer parentId;

    @ApiModelProperty(value="���ܵ�ַ")
    private String url;

    @ApiModelProperty(value="���ͣ�1:�˵���2��ť")
    private Integer type;

    @ApiModelProperty(value="״̬��1�����ã�2������")
    private Integer status;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="��ע")
    private String remarks;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="������")
    private String createdMan;

    @ApiModelProperty(value="�޸�ʱ��")
    private Date updatedAt;

    @ApiModelProperty(value="�޸���")
    private String updatedMan;
}