package com.juwen.ibc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator on 2019/04/11
*/
@ApiModel(value="SystemStudentFileData" ,description="学习资料表")
@Data
@SuppressWarnings("serial")
public class SystemStudentFileData {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="文件名称")
    private String fileName;

    @ApiModelProperty(value="文件路径")
    private String filePath;

    @ApiModelProperty(value="资料类型")
    private Integer systemStudentFileDataTypeId;

    @ApiModelProperty(value="备注")
    private String fileDescription;

    @ApiModelProperty(value="下载次数")
    private Integer fileDownloadNum;

    @ApiModelProperty(value="上传者")
    private String fileUploader;

    @ApiModelProperty(value="上传者id")
    private Integer fileUploaderId;

    @ApiModelProperty(value="排序，由小到大")
    private Integer listOrder;

    @ApiModelProperty(value="状态，1：可用，2：不可用")
    private Integer status;

    @ApiModelProperty(value="创建时间")
    private Date createAt;

    @ApiModelProperty(value="老系统id")
    private String newId;

    @ApiModelProperty(value="文件内容")
    private String fileContent;
}