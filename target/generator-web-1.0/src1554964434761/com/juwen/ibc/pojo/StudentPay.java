package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ѧ���ɷ����")
@Data
@SuppressWarnings("serial")
public class StudentPay {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="ѧ��id")
    private Integer studyYearId;

    @ApiModelProperty(value="�ɷ�����")
    private Date payDate;

    @ApiModelProperty(value="�ɷ�����")
    private Integer payType;

    @ApiModelProperty(value="�ɷѽ��")
    private BigDecimal payNum;

    @ApiModelProperty(value="ʵ�ɽ��")
    private BigDecimal realNum;

    @ApiModelProperty(value="רҵid")
    private Integer professionId;

    @ApiModelProperty(value="�ɷ�״̬:0δ��,1�ѽ�")
    private Integer status;
}