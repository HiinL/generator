package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemStudentFileData" ,description="ѧϰ���ϱ�")
@Data
@SuppressWarnings("serial")
public class SystemStudentFileData {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="�ļ�����")
    private String fileName;

    @ApiModelProperty(value="�ļ�·��")
    private String filePath;

    @ApiModelProperty(value="��������")
    private Integer systemStudentFileDataTypeId;

    @ApiModelProperty(value="��ע")
    private String fileDescription;

    @ApiModelProperty(value="���ش���")
    private Integer fileDownloadNum;

    @ApiModelProperty(value="�ϴ���")
    private String fileUploader;

    @ApiModelProperty(value="�ϴ���id")
    private Integer fileUploaderId;

    @ApiModelProperty(value="������С����")
    private Integer listOrder;

    @ApiModelProperty(value="״̬��1�����ã�2��������")
    private Integer status;

    @ApiModelProperty(value="����ʱ��")
    private Date createAt;

    @ApiModelProperty(value="��ϵͳid")
    private String newId;

    @ApiModelProperty(value="�ļ�����")
    private String fileContent;
}