package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudyPlan" ,description="ѧϰ�ƻ���")
@Data
@SuppressWarnings("serial")
public class StudyPlan {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�γ�id")
    private Integer curriculumId;

    @ApiModelProperty(value="�γ�����")
    private String curriculumName;

    @ApiModelProperty(value="�γ̴���")
    private String curriculumCode;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="ѧ���˻���¼��")
    private String loginName;

    @ApiModelProperty(value="���1��ѧ��Ŀ��2ѡѧ��Ŀ")
    private Integer type;

    @ApiModelProperty(value="��ϰָ��1")
    private String reviewOne;

    @ApiModelProperty(value="��ϰָ��2")
    private String reviewTwo;

    @ApiModelProperty(value="��ϰָ��3")
    private String reviewThree;

    @ApiModelProperty(value="��Ӧ�꼶˵��")
    private String gradeDesc;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="����רҵid")
    private Integer professionalId;
}