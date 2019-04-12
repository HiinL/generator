package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="学生缴费情况")
@Data
@SuppressWarnings("serial")
public class StudentPay {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="学年id")
    private Integer studyYearId;

    @ApiModelProperty(value="缴费日期")
    private Date payDate;

    @ApiModelProperty(value="缴费类型")
    private Integer payType;

    @ApiModelProperty(value="缴费金额")
    private BigDecimal payNum;

    @ApiModelProperty(value="实缴金额")
    private BigDecimal realNum;

    @ApiModelProperty(value="专业id")
    private Integer professionId;

    @ApiModelProperty(value="缴费状态:0未缴,1已缴")
    private Integer status;
}