package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="StudentStudyNotes" ,description="ѧϰ�ʼǱ�")
@Data
@SuppressWarnings("serial")
public class StudentStudyNotes {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="���� 1:��Ƶ,2:�Ծ�����,3:����,4:���,5:�����Կ���(����)")
    private Integer type;

    @ApiModelProperty(value="��¼�ʼǵı��⣨������Ŀ���ơ���Ƶ���ƣ�")
    private String notesTitle;

    @ApiModelProperty(value="�ʼ�����")
    private String contents;

    @ApiModelProperty(value="��Ŀid")
    private Integer curriculumId;

    @ApiModelProperty(value="����ҵ���id")
    private Integer bussinessId;

    @ApiModelProperty(value="��Դ��Դ����¼�������")
    private String sourceTable;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Byte status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�޸�ʱ��")
    private Date updateAt;
}