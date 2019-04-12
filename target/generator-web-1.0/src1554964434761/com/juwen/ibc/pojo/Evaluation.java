package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="�����Կ��ˣ��׶��Բ��ԣ���")
@Data
@SuppressWarnings("serial")
public class Evaluation {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentId;

    @ApiModelProperty(value="��������")
    private String tname;

    @ApiModelProperty(value="�Ƿ�����:1����2����3δ����")
    private Integer lock;

    @ApiModelProperty(value="�γ̱��")
    private String currCode;

    @ApiModelProperty(value="����ʱ��")
    private Date ttime;

    @ApiModelProperty(value="�Ծ�id")
    private Integer paperId;

    @ApiModelProperty(value="�Ծ�ʣ�����")
    private Integer degree;

    @ApiModelProperty(value="��������")
    private Integer evaluationType;

    @ApiModelProperty(value="��߷�")
    private Float topScore;

    @ApiModelProperty(value="���ʱ��")
    private Date createAt;

    @ApiModelProperty(value=" ��ע")
    private String remark;

    @ApiModelProperty(value="������ʱ��")
    private Date allTime;

    @ApiModelProperty(value="��ȷ��")
    private Integer correct;

    @ApiModelProperty(value="������")
    private Integer mistake;

    @ApiModelProperty(value="δ������")
    private Integer notfill;

    @ApiModelProperty(value="��ϵͳid")
    private String paperNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String studentNewId;
}