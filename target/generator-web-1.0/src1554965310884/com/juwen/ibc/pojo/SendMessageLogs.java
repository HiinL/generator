package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SendMessageLogs" ,description="���ŷ�����־��")
@Data
@SuppressWarnings("serial")
public class SendMessageLogs {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="�ֻ���")
    private String mobileNo;

    @ApiModelProperty(value="����ʱ��")
    private Date sendDate;

    @ApiModelProperty(value="��ע")
    private String remark;

    @ApiModelProperty(value="ip��ַ")
    private String ipAddress;

    @ApiModelProperty(value="�豸��")
    private String deviceNo;

    @ApiModelProperty(value="��֤��")
    private String code;

    @ApiModelProperty(value="״̬��1�����ã�2������")
    private Integer status;
}