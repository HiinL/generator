package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ѧϰ���۱�")
@Data
@SuppressWarnings("serial")
public class StudyComment {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ���û�id")
    private Integer studentInfoId;

    @ApiModelProperty(value="��������")
    private String notes;

    @ApiModelProperty(value="����ҵ��id(ϵͳ��Ƶid)")
    private Integer bussinessId;

    @ApiModelProperty(value="��������,1:��Ƶ")
    private Integer notesType;

    @ApiModelProperty(value="���Ը�id")
    private Integer parentId;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;
}