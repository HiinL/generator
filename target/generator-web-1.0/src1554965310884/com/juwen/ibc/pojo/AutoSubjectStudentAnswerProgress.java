package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoSubjectStudentAnswerProgress" ,description="�����ϰ֮ѧ���������")
@Data
@SuppressWarnings("serial")
public class AutoSubjectStudentAnswerProgress {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="�����ѧ��")
    private Integer studentId;

    @ApiModelProperty(value="��Ŀid")
    private Integer curriculumId;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="����ʱ��")
    private Date updateAt;

    @ApiModelProperty(value="��ǰ���һ�����Ŀλ��")
    private Integer lastAnswerIndex;

    @ApiModelProperty(value="�����ϰ������id")
    private Integer autoSubtypeId;
}