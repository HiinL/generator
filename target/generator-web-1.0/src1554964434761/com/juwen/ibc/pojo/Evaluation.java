package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="过程性考核（阶段性测试）表")
@Data
@SuppressWarnings("serial")
public class Evaluation {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentId;

    @ApiModelProperty(value="测试名称")
    private String tname;

    @ApiModelProperty(value="是否锁定:1锁定2解锁3未答题")
    private Integer lock;

    @ApiModelProperty(value="课程编号")
    private String currCode;

    @ApiModelProperty(value="测试时长")
    private Date ttime;

    @ApiModelProperty(value="试卷id")
    private Integer paperId;

    @ApiModelProperty(value="试卷剩余次数")
    private Integer degree;

    @ApiModelProperty(value="测试类型")
    private Integer evaluationType;

    @ApiModelProperty(value="最高分")
    private Float topScore;

    @ApiModelProperty(value="添加时间")
    private Date createAt;

    @ApiModelProperty(value=" 备注")
    private String remark;

    @ApiModelProperty(value="测试总时长")
    private Date allTime;

    @ApiModelProperty(value="正确数")
    private Integer correct;

    @ApiModelProperty(value="错误数")
    private Integer mistake;

    @ApiModelProperty(value="未作答数")
    private Integer notfill;

    @ApiModelProperty(value="老系统id")
    private String paperNewId;

    @ApiModelProperty(value="老系统id")
    private String studentNewId;
}