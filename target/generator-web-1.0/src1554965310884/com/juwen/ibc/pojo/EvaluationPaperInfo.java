package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="EvaluationPaperInfo" ,description="�׶��Բ����Ծ��")
@Data
@SuppressWarnings("serial")
public class EvaluationPaperInfo {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="������Ŀ����")
    private Integer autoSubtype;

    @ApiModelProperty(value="��ע")
    private String remark;

    @ApiModelProperty(value="�Ծ�id")
    private Integer paperId;

    @ApiModelProperty(value="��Ŀid")
    private Integer autoSubjectId;

    @ApiModelProperty(value="�γ̱��")
    private String curriculumCode;

    @ApiModelProperty(value="רҵid")
    private Integer professionId;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ϵͳid")
    private String paperNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;
}