package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentFeedback" ,description="ѧ��������")
@Data
@SuppressWarnings("serial")
public class StudentFeedback {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentId;

    @ApiModelProperty(value="ѧ������")
    private String studentName;

    @ApiModelProperty(value="����")
    private String title;

    @ApiModelProperty(value="��������")
    private String contents;

    @ApiModelProperty(value="������� 0:����,1:����,2:����,3:����")
    private Integer type;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;
}