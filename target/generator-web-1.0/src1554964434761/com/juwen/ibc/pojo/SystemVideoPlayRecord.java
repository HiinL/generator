package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="��Ƶ���ż�¼��")
@Data
@SuppressWarnings("serial")
public class SystemVideoPlayRecord {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="����ʱ����ʱ�������ȷ���룬0���Ա�ʾ��δ���Ź�")
    private Integer playDuration;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="����ʱ��")
    private Date updateAt;

    @ApiModelProperty(value="�ϴβ���ʱ��")
    private Date lastPlayTime;

    @ApiModelProperty(value="��Ƶid")
    private Integer systemVideoId;

    @ApiModelProperty(value="ѧ��id")
    private Integer studentInfoId;

    @ApiModelProperty(value="������Ƶ��id")
    private Integer systemVideoDetailId;
}