package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentFeedback" ,description="学生反馈表")
@Data
@SuppressWarnings("serial")
public class StudentFeedback {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentId;

    @ApiModelProperty(value="学生姓名")
    private String studentName;

    @ApiModelProperty(value="标题")
    private String title;

    @ApiModelProperty(value="反馈内容")
    private String contents;

    @ApiModelProperty(value="反馈类别 0:设诉,1:建议,2:问题,3:其他")
    private Integer type;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;
}