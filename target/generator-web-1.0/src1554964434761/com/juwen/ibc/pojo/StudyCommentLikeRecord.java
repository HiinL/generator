package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="评论点赞记录表")
@Data
@SuppressWarnings("serial")
public class StudyCommentLikeRecord {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentId;

    @ApiModelProperty(value="评论表id")
    private Integer studyCommentId;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}