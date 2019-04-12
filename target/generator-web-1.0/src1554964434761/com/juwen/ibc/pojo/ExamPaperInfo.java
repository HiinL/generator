package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="�����Ծ���Ϣ��")
@Data
@SuppressWarnings("serial")
public class ExamPaperInfo {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="����")
    private String title;

    @ApiModelProperty(value="���Ա���")
    private String subTitle;

    @ApiModelProperty(value="����ʱ��")
    private Integer examMinutes;

    @ApiModelProperty(value="�����ܷ�")
    private Integer examTotalScore;

    @ApiModelProperty(value="���Լ����")
    private Integer examPassScore;

    @ApiModelProperty(value="����,1:ģ�⿼�� 2:������ҵ 3:�½���ϰ")
    private Integer type;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="��ע")
    private String descriptions;
}