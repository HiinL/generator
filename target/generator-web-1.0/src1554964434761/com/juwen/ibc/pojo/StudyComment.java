package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="学习评论表")
@Data
@SuppressWarnings("serial")
public class StudyComment {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生用户id")
    private Integer studentInfoId;

    @ApiModelProperty(value="留言内容")
    private String notes;

    @ApiModelProperty(value="关联业务id(系统视频id)")
    private Integer bussinessId;

    @ApiModelProperty(value="评论类型,1:视频")
    private Integer notesType;

    @ApiModelProperty(value="留言父id")
    private Integer parentId;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}