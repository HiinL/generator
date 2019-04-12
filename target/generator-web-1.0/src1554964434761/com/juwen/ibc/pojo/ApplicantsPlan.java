package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="�����ƻ���")
@Data
@SuppressWarnings("serial")
public class ApplicantsPlan {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="��������id")
    private Integer batchId;

    @ApiModelProperty(value="������id")
    private Integer adminId;

    @ApiModelProperty(value="ѧ���������(���Ϻ���)")
    private Integer categoryId;

    @ApiModelProperty(value="ѧ��ע�����Ϣid")
    private Integer registerPointId;

    @ApiModelProperty(value="ѧ����Ϣid")
    private Integer studentInfoId;

    @ApiModelProperty(value="רҵid")
    private Integer professionId;

    @ApiModelProperty(value="������")
    private BigDecimal totalExamFee;

    @ApiModelProperty(value="��������1")
    private Date examDateOne;

    @ApiModelProperty(value="�����γ�������Ϣ1")
    private String examDateOneCurriculum;

    @ApiModelProperty(value="��������2")
    private Date examDateTwo;

    @ApiModelProperty(value="�����γ�������Ϣ2")
    private String examDateTwoCurriculum;

    @ApiModelProperty(value="��������3")
    private Date examDateThree;

    @ApiModelProperty(value="�����γ�������Ϣ3")
    private String examDateThreeCurriculum;

    @ApiModelProperty(value="�ƴ�")
    private Integer examNum;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;
}