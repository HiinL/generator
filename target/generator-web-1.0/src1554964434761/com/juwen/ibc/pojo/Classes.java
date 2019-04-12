package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="班级信息表")
@Data
@SuppressWarnings("serial")
public class Classes {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="名称")
    private String name;

    @ApiModelProperty(value="所属专业id")
    private Integer professionId;

    @ApiModelProperty(value="所属学校id")
    private Integer schoolId;

    @ApiModelProperty(value="班级描述")
    private String description;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;
}