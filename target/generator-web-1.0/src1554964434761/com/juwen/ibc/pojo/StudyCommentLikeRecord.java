package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="���۵��޼�¼��")
@Data
@SuppressWarnings("serial")
public class StudyCommentLikeRecord {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentId;

    @ApiModelProperty(value="���۱�id")
    private Integer studyCommentId;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}