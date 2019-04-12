package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AppVersion" ,description="app�汾���±�")
@Data
@SuppressWarnings("serial")
public class AppVersion {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="�汾��")
    private String code;

    @ApiModelProperty(value="��������ps�ֺŸ���")
    private String description;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�ͻ�������1:android 2:ios")
    private Integer clientType;

    @ApiModelProperty(value="���ص�ַ")
    private String downloadUrl;

    @ApiModelProperty(value="�������ͣ�0��ǿ�Ƹ��£�1ǿ�Ƹ���")
    private String updateType;
}