package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="EvaluationCurriculumPaper" ,description="�׶����ۺϲ����Ծ�Ϳ�Ŀ�Ĺ�ϵ��")
@Data
@SuppressWarnings("serial")
public class EvaluationCurriculumPaper {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�γ̱��")
    private String curriculumCode;

    @ApiModelProperty(value="�Ծ�id")
    private Integer paperId;

    @ApiModelProperty(value="רҵid")
    private Integer professionId;

    @ApiModelProperty(value="��ϵͳid")
    private String paperNewId;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;
}