package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="学生学习记录表")
@Data
@SuppressWarnings("serial")
public class StudentStudyRecord {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="学习类型 1:视频学习,2:试卷真题学习,3:考纲学习,4:题库学习,5:过程性考核(海南)")
    private Integer studyType;

    @ApiModelProperty(value="资源来源表，记录表的名称")
    private String sourceTable;

    @ApiModelProperty(value="关联业务表id")
    private Integer bussinessId;

    @ApiModelProperty(value="科目id")
    private Integer curriculumId;

    @ApiModelProperty(value="学习内容（比如题目名称、视频名称）")
    private String studyContent;

    @ApiModelProperty(value="学习分数")
    private String studyScore;

    @ApiModelProperty(value="播放时长：时间戳，精确到秒，0可以表示从未播放过")
    private Integer videoPlayDuration;

    @ApiModelProperty(value="最后一题的题目位置")
    private Integer lastAnswerIndex;

    @ApiModelProperty(value="学习时间")
    private Date studyTime;

    @ApiModelProperty(value="老系统id")
    private String studentInfoNewId;

    @ApiModelProperty(value="老数据-学习路径")
    private String studyPath;

    @ApiModelProperty(value="老系统id")
    private String newId;
}