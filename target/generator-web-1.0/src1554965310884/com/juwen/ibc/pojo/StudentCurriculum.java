package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentCurriculum" ,description="ѧ���γ�״̬")
@Data
@SuppressWarnings("serial")
public class StudentCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="�γ�id")
    private Integer curriculumId;

    @ApiModelProperty(value="״̬��0δͨ��,1 ��ͨ��")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}