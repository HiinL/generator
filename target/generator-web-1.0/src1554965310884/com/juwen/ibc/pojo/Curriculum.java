package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="Curriculum" ,description="科目表")
@Data
@SuppressWarnings("serial")
public class Curriculum {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="名称")
    private String name;

    @ApiModelProperty(value="名称代码")
    private String code;

    @ApiModelProperty(value="报考类别id")
    private Integer categoryId;

    @ApiModelProperty(value="科目类型，1公共课，2核心课，3选考课，4毕业论文")
    private Integer type;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="学分")
    private Integer credits;

    @ApiModelProperty(value="课程热度，数字取值 1到5,可用来表示1星到5星")
    private Integer hotNumber;

    @ApiModelProperty(value="0正常，1表示热门课程")
    private Byte isHot;
}