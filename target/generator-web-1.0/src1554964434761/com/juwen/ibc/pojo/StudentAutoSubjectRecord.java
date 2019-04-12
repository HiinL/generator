package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="学生答题情况记录表")
@Data
@SuppressWarnings("serial")
public class StudentAutoSubjectRecord {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="答题的学生")
    private Integer studentId;

    @ApiModelProperty(value="类型 1:视频,2:试卷真题,3:考纲,4:题库,5:过程性考核(海南)")
    private Integer type;

    @ApiModelProperty(value="科目id")
    private Integer curriculumId;

    @ApiModelProperty(value="题目id")
    private Integer autoSubjectId;

    @ApiModelProperty(value="题目名称")
    private String autoSubjectName;

    @ApiModelProperty(value="累计回答次数")
    private Integer answerCount;

    @ApiModelProperty(value="累计答错的次数")
    private Integer answerErrorCount;

    @ApiModelProperty(value="创建时间（可理解为首次答题时间）")
    private Date createAt;

    @ApiModelProperty(value="更新时间")
    private Date updateAt;

    @ApiModelProperty(value="最后一次答题状态，回答是否正确：0、答案不存在对错，1、回答正确，-1、回答错误")
    private Byte lastAnswerStatus;

    @ApiModelProperty(value="最后一次答题的题目内容")
    private String lastAnswerContents;
}