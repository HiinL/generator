package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value= ,description="������")
public class ExamQuestionBankWithBLOBs extends ExamQuestionBank {
    @ApiModelProperty(value="����")
    private String contents;

    @ApiModelProperty(value="������Ŀ����")
    private String descriptions;
}