package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="ExamUser" ,description="����ѧ���û���")
@Data
@SuppressWarnings("serial")
public class ExamUser {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="��ʵ����")
    private String name;

    @ApiModelProperty(value="��¼��")
    private String loginName;

    @ApiModelProperty(value="����")
    private String password;

    @ApiModelProperty(value="�û����ͣ�1:����Ա,2:��ʦ,3:ѧ��???(��Ҫ��ô�����ͣ�)")
    private Integer userType;

    @ApiModelProperty(value="���Գ���")
    private Integer userFrom;

    @ApiModelProperty(value="?????")
    private Integer userFlag;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String userFromNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String userFlagNewId;
}