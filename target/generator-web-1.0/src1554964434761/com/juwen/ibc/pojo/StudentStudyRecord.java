package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ѧ��ѧϰ��¼��")
@Data
@SuppressWarnings("serial")
public class StudentStudyRecord {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="ѧϰ���� 1:��Ƶѧϰ,2:�Ծ�����ѧϰ,3:����ѧϰ,4:���ѧϰ,5:�����Կ���(����)")
    private Integer studyType;

    @ApiModelProperty(value="��Դ��Դ����¼�������")
    private String sourceTable;

    @ApiModelProperty(value="����ҵ���id")
    private Integer bussinessId;

    @ApiModelProperty(value="��Ŀid")
    private Integer curriculumId;

    @ApiModelProperty(value="ѧϰ���ݣ�������Ŀ���ơ���Ƶ���ƣ�")
    private String studyContent;

    @ApiModelProperty(value="ѧϰ����")
    private String studyScore;

    @ApiModelProperty(value="����ʱ����ʱ�������ȷ���룬0���Ա�ʾ��δ���Ź�")
    private Integer videoPlayDuration;

    @ApiModelProperty(value="���һ�����Ŀλ��")
    private Integer lastAnswerIndex;

    @ApiModelProperty(value="ѧϰʱ��")
    private Date studyTime;

    @ApiModelProperty(value="��ϵͳid")
    private String studentInfoNewId;

    @ApiModelProperty(value="������-ѧϰ·��")
    private String studyPath;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;
}