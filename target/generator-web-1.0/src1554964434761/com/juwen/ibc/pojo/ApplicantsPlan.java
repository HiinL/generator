package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="报考计划表")
@Data
@SuppressWarnings("serial")
public class ApplicantsPlan {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="报考批次id")
    private Integer batchId;

    @ApiModelProperty(value="负责人id")
    private Integer adminId;

    @ApiModelProperty(value="学生报考类别(湖南海南)")
    private Integer categoryId;

    @ApiModelProperty(value="学生注册点信息id")
    private Integer registerPointId;

    @ApiModelProperty(value="学生信息id")
    private Integer studentInfoId;

    @ApiModelProperty(value="专业id")
    private Integer professionId;

    @ApiModelProperty(value="报考费")
    private BigDecimal totalExamFee;

    @ApiModelProperty(value="报考日期1")
    private Date examDateOne;

    @ApiModelProperty(value="报考课程内容信息1")
    private String examDateOneCurriculum;

    @ApiModelProperty(value="报考日期2")
    private Date examDateTwo;

    @ApiModelProperty(value="报考课程内容信息2")
    private String examDateTwoCurriculum;

    @ApiModelProperty(value="报考日期3")
    private Date examDateThree;

    @ApiModelProperty(value="报考课程内容信息3")
    private String examDateThreeCurriculum;

    @ApiModelProperty(value="科次")
    private Integer examNum;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;
}