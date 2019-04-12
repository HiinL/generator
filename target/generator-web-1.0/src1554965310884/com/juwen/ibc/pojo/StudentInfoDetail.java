package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentInfoDetail" ,description="ѧ����Ϣ�����")
@Data
@SuppressWarnings("serial")
public class StudentInfoDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="�Ա�0Ů��1��")
    private String sex;

    @ApiModelProperty(value="ѧ�����")
    private Integer educationalBackground;

    @ApiModelProperty(value="�������")
    private Integer educational;

    @ApiModelProperty(value="��רҵid")
    private Integer oldPrefession;

    @ApiModelProperty(value="����������")
    private Integer recruitPointId;

    @ApiModelProperty(value="����ע���")
    private Integer registerPointId;

    @ApiModelProperty(value="��������")
    private Integer batchId;

    @ApiModelProperty(value="��ϵ�绰")
    private String phone;

    @ApiModelProperty(value="��ϵ�绰2")
    private String phone2;

    @ApiModelProperty(value="��������")
    private String email;

    @ApiModelProperty(value="��ϵqq")
    private String qq;

    @ApiModelProperty(value="��ϵ��ַ")
    private String address;

    @ApiModelProperty(value="��Ƭ")
    private String picFace;

    @ApiModelProperty(value="���֤��Ƭ")
    private String picCard;

    @ApiModelProperty(value="ѧ��֤����Ƭ")
    private String picEdu;

    @ApiModelProperty(value="��ѧ����")
    private Date enrollmentDate;

    @ApiModelProperty(value="����")
    private String nation;

    @ApiModelProperty(value="������λ")
    private String workIn;

    @ApiModelProperty(value="����ְλ")
    private String workPost;

    @ApiModelProperty(value="��ҵѧУ")
    private String graduateInstitutions;

    @ApiModelProperty(value="��ҵ֤����")
    private String graduationCertificateNo;

    @ApiModelProperty(value="������Ƭ")
    private String otherPic;

    @ApiModelProperty(value="����ѧλ")
    private Integer needDegree;

    @ApiModelProperty(value="����")
    private String description;

    @ApiModelProperty(value="����")
    private Date birthday;

    @ApiModelProperty(value="ʡ����")
    private String provinceCode;

    @ApiModelProperty(value="���б���")
    private String cityCode;

    @ApiModelProperty(value="��ַ��ϸ")
    private String addressDetail;

    @ApiModelProperty(value="���ر���")
    private String areaCode;

    @ApiModelProperty(value="�ֻ��� 1:ĩ�󶨣�2:��")
    private Integer phoneBind;

    @ApiModelProperty(value="������ϵ�˵绰")
    private String sosPhone;

    @ApiModelProperty(value="������ϵ�˵�ַ")
    private String sosAddress;
}