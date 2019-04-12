package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="NewsInformation" ,description="������Ѷ��")
@Data
@SuppressWarnings("serial")
public class NewsInformation {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="����")
    private String title;

    @ApiModelProperty(value="����")
    private String author;

    @ApiModelProperty(value="״̬��1�����ã�2������")
    private Integer status;

    @ApiModelProperty(value="���ͣ�0")
    private String type;

    @ApiModelProperty(value="���������")
    private Integer viewerNum;

    @ApiModelProperty(value="����")
    private Integer listOrder;

    @ApiModelProperty(value="����ʱ��")
    private Date publishAt;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�������ṩ�Ĺ��ҵ����")
    private String thirdUrl;

    @ApiModelProperty(value="����")
    private String contents;
}