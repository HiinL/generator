package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="֪ͨ�����")
@Data
@SuppressWarnings("serial")
public class Notices {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String title;

    @ApiModelProperty(value="����")
    private Integer noticeType;

    @ApiModelProperty(value="����")
    private String content;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}