package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value= ,description="��Ŀ���������")
public class AutoSubjectDetailWithBLOBs extends AutoSubjectDetail {
    @ApiModelProperty(value="����")
    private String examPoint;

    @ApiModelProperty(value="�̲�ҳ��")
    private String pageNumber;

    @ApiModelProperty(value="��Ŀ����")
    private String analysis;
}