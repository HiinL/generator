package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SubjectErrorCorrection" ,description="��Ŀ�����")
@Data
@SuppressWarnings("serial")
public class SubjectErrorCorrection {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="���� 1:��Ƶ,2:�Ծ�����,3:����,4:���,5:�����Կ���(����)")
    private Integer type;

    @ApiModelProperty(value="��Դ��Դ����¼�������")
    private String sourceTable;

    @ApiModelProperty(value="����ҵ���id")
    private Integer bussinessId;

    @ApiModelProperty(value="ѧ���ύ��������")
    private String contents;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�������ͣ�0��������1���������⣻2���������������3���д���֣�4��ѡ�������⣻5�����������⣻")
    private Integer errorType;
}