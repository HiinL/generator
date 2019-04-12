package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value= ,description="ϵͳ��Ƶ��ϸ��")
@Data
@SuppressWarnings("serial")
public class SystemVideoDetail {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="ϵͳ��Ƶid")
    private Integer systemVideoId;

    @ApiModelProperty(value="��Ƶ����")
    private String name;

    @ApiModelProperty(value="��Ƶ��ַ")
    private String videoPath;

    @ApiModelProperty(value="����ͼ��ַ")
    private String thumbPath;

    @ApiModelProperty(value="��ʦ����")
    private String teacherName;

    @ApiModelProperty(value="��Ƶʱ��")
    private String duration;

    @ApiModelProperty(value="������")
    private String operatorName;

    @ApiModelProperty(value="������ע")
    private String descriptions;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="�ۼ������")
    private Integer viewerCount;

    @ApiModelProperty(value="�ۼ����������ʵ���ݣ�")
    private Integer realViewerCount;
}