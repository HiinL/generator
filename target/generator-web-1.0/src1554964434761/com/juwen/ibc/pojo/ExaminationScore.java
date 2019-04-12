package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="�ҵĳɼ���")
@Data
@SuppressWarnings("serial")
public class ExaminationScore {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�γ�id")
    private Integer curriculumId;

    @ApiModelProperty(value="�γ�����")
    private String curriculumName;

    @ApiModelProperty(value="�γ̴���")
    private String curriculumCode;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="ѧ���˻���¼��")
    private String loginName;

    @ApiModelProperty(value="���1�����γ̣�2���Ŀγ̣�3ѡ���γ�")
    private Integer type;

    @ApiModelProperty(value="״̬ 1��ͨ����2ĩͨ����3ĩ����")
    private Integer examinationStatus;

    @ApiModelProperty(value="�ɼ�ȷ��״̬ Ĭ��0Ϊ�ɼ�ĩȷ�� 1�ɼ�ȷ��")
    private Integer examinationConfirmStatus;

    @ApiModelProperty(value="�ɼ�����")
    private String examinationScore;

    @ApiModelProperty(value="����ʱ��")
    private Date examinationAt;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="����ʱ��")
    private Date updateAt;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="������")
    private String examNumber;

    @ApiModelProperty(value="�ɼ�����״̬ Ĭ��0Ϊĩ�ύ���� 1���ύ����")
    private Integer objectionConfirmStatus;
}