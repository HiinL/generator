package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SubjectErrorCorrection" ,description="题目纠错表")
@Data
@SuppressWarnings("serial")
public class SubjectErrorCorrection {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="类型 1:视频,2:试卷真题,3:考纲,4:题库,5:过程性考核(海南)")
    private Integer type;

    @ApiModelProperty(value="资源来源表，记录表的名称")
    private String sourceTable;

    @ApiModelProperty(value="关联业务表id")
    private Integer bussinessId;

    @ApiModelProperty(value="学生提交纠错内容")
    private String contents;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="错误类型：0、其他；1、答案有问题；2、答案与解析不符；3、有错别字；4、选项有问题；5、内容有问题；")
    private Integer errorType;
}