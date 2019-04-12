package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoSubject" ,description="题库表")
@Data
@SuppressWarnings("serial")
public class AutoSubject {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="科目编码")
    private String curriculumCode;

    @ApiModelProperty(value="类别 1:湖南自考,2:海南自考,4:成考专科,8:成考本科")
    private Integer category;

    @ApiModelProperty(value="专业代码")
    private String profession;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="老系统id")
    private String professionNewId;

    @ApiModelProperty(value="插入位置")
    private Integer location;

    @ApiModelProperty(value="题目名称")
    private String name;
}