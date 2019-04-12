package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ѧ�����������¼��")
@Data
@SuppressWarnings("serial")
public class StudentAutoSubjectRecord {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="�����ѧ��")
    private Integer studentId;

    @ApiModelProperty(value="���� 1:��Ƶ,2:�Ծ�����,3:����,4:���,5:�����Կ���(����)")
    private Integer type;

    @ApiModelProperty(value="��Ŀid")
    private Integer curriculumId;

    @ApiModelProperty(value="��Ŀid")
    private Integer autoSubjectId;

    @ApiModelProperty(value="��Ŀ����")
    private String autoSubjectName;

    @ApiModelProperty(value="�ۼƻش����")
    private Integer answerCount;

    @ApiModelProperty(value="�ۼƴ��Ĵ���")
    private Integer answerErrorCount;

    @ApiModelProperty(value="����ʱ�䣨�����Ϊ�״δ���ʱ�䣩")
    private Date createAt;

    @ApiModelProperty(value="����ʱ��")
    private Date updateAt;

    @ApiModelProperty(value="���һ�δ���״̬���ش��Ƿ���ȷ��0���𰸲����ڶԴ�1���ش���ȷ��-1���ش����")
    private Byte lastAnswerStatus;

    @ApiModelProperty(value="���һ�δ������Ŀ����")
    private String lastAnswerContents;
}