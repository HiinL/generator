package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ѧ�������ظ���")
@Data
@SuppressWarnings("serial")
public class StudentFeedbackDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��Ͷ��id")
    private Integer studentFeedbackId;

    @ApiModelProperty(value="��ϸ����")
    private String detail;

    @ApiModelProperty(value="�������û�id")
    private Integer operatorId;

    @ApiModelProperty(value="��Ϣ��id")
    private Integer parentId;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}