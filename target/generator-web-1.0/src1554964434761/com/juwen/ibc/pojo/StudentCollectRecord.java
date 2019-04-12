package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="收藏记录表")
@Data
@SuppressWarnings("serial")
public class StudentCollectRecord {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="类型 1:视频,2:试卷真题,3:考纲,4:题库,5:过程性考核(海南)")
    private Integer type;

    @ApiModelProperty(value="资源来源表，记录表的名称")
    private String sourceTable;

    @ApiModelProperty(value="关联业务表id")
    private Integer bussinessId;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="科目id")
    private Integer curriculumId;

    @ApiModelProperty(value="收藏内容的标题（比如题目名称、视频名称）")
    private String collectTitle;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Byte status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="更新时间")
    private Date updateAt;
}