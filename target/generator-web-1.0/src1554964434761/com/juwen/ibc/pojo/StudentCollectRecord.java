package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="�ղؼ�¼��")
@Data
@SuppressWarnings("serial")
public class StudentCollectRecord {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="���� 1:��Ƶ,2:�Ծ�����,3:����,4:���,5:�����Կ���(����)")
    private Integer type;

    @ApiModelProperty(value="��Դ��Դ����¼�������")
    private String sourceTable;

    @ApiModelProperty(value="����ҵ���id")
    private Integer bussinessId;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="��Ŀid")
    private Integer curriculumId;

    @ApiModelProperty(value="�ղ����ݵı��⣨������Ŀ���ơ���Ƶ���ƣ�")
    private String collectTitle;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Byte status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="����ʱ��")
    private Date updateAt;
}