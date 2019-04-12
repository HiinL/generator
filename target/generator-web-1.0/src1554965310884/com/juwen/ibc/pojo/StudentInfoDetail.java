package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentInfoDetail" ,description="学生信息详情表")
@Data
@SuppressWarnings("serial")
public class StudentInfoDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="学生id")
    private Integer studentInfoId;

    @ApiModelProperty(value="性别：0女，1男")
    private String sex;

    @ApiModelProperty(value="学历层次")
    private Integer educationalBackground;

    @ApiModelProperty(value="报考层次")
    private Integer educational;

    @ApiModelProperty(value="旧专业id")
    private Integer oldPrefession;

    @ApiModelProperty(value="所属招生点")
    private Integer recruitPointId;

    @ApiModelProperty(value="所属注册点")
    private Integer registerPointId;

    @ApiModelProperty(value="报考批次")
    private Integer batchId;

    @ApiModelProperty(value="联系电话")
    private String phone;

    @ApiModelProperty(value="联系电话2")
    private String phone2;

    @ApiModelProperty(value="电子邮箱")
    private String email;

    @ApiModelProperty(value="联系qq")
    private String qq;

    @ApiModelProperty(value="联系地址")
    private String address;

    @ApiModelProperty(value="相片")
    private String picFace;

    @ApiModelProperty(value="身份证照片")
    private String picCard;

    @ApiModelProperty(value="学历证书照片")
    private String picEdu;

    @ApiModelProperty(value="入学日期")
    private Date enrollmentDate;

    @ApiModelProperty(value="民族")
    private String nation;

    @ApiModelProperty(value="工作单位")
    private String workIn;

    @ApiModelProperty(value="工作职位")
    private String workPost;

    @ApiModelProperty(value="毕业学校")
    private String graduateInstitutions;

    @ApiModelProperty(value="毕业证号码")
    private String graduationCertificateNo;

    @ApiModelProperty(value="其他照片")
    private String otherPic;

    @ApiModelProperty(value="报考学位")
    private Integer needDegree;

    @ApiModelProperty(value="描述")
    private String description;

    @ApiModelProperty(value="生日")
    private Date birthday;

    @ApiModelProperty(value="省编码")
    private String provinceCode;

    @ApiModelProperty(value="城市编码")
    private String cityCode;

    @ApiModelProperty(value="地址明细")
    private String addressDetail;

    @ApiModelProperty(value="区县编码")
    private String areaCode;

    @ApiModelProperty(value="手机绑定 1:末绑定，2:绑定")
    private Integer phoneBind;

    @ApiModelProperty(value="紧急联系人电话")
    private String sosPhone;

    @ApiModelProperty(value="紧急联系人地址")
    private String sosAddress;
}