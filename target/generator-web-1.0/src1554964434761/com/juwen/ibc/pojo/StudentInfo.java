package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ѧ����Ϣ��")
@Data
@SuppressWarnings("serial")
public class StudentInfo {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ������")
    private String name;

    @ApiModelProperty(value="���֤��")
    private String cardNumber;

    @ApiModelProperty(value="������")
    private String examNumber;

    @ApiModelProperty(value="����")
    private String password;

    @ApiModelProperty(value="������ʦ��Աid")
    private Integer adminId;

    @ApiModelProperty(value="�༶id")
    private Integer classesId;

    @ApiModelProperty(value="����רҵid")
    private Integer professionalId;

    @ApiModelProperty(value="����ѧУid")
    private Integer schoolId;

    @ApiModelProperty(value="ѧ���������id")
    private Integer categoryId;

    @ApiModelProperty(value="��֧վ��id")
    private Integer branchId;

    @ApiModelProperty(value="ѧ��״̬id")
    private Integer studentStatusId;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="ѧ������ʦ������")
    private String teacherComment;

    @ApiModelProperty(value="��ʦ����")
    private String teacherScore;

    @ApiModelProperty(value="")
    private String token;
}