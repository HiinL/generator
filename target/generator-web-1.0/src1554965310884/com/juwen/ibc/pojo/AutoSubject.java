package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="AutoSubject" ,description="����")
@Data
@SuppressWarnings("serial")
public class AutoSubject {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="��Ŀ����")
    private String curriculumCode;

    @ApiModelProperty(value="��� 1:�����Կ�,2:�����Կ�,4:�ɿ�ר��,8:�ɿ�����")
    private Integer category;

    @ApiModelProperty(value="רҵ����")
    private String profession;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ϵͳid")
    private String professionNewId;

    @ApiModelProperty(value="����λ��")
    private Integer location;

    @ApiModelProperty(value="��Ŀ����")
    private String name;
}