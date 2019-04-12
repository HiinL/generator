package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentCurriculum" ,description="学生课程状态")
@Data
@SuppressWarnings("serial")
public class StudentCurriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="课程id")
    private Integer curriculumId;

    @ApiModelProperty(value="状态，0未通过,1 已通过")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}