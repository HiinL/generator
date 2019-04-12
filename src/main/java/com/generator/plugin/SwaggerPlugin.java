package com.generator.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * @ClassName 根据数据库注释对实体类增加swagger2文档注解
 * @Auther: Uny
 * @Date: 2019/4/11 13:52
 * @Description: TODO
 * @Version 1.0
 */
public class SwaggerPlugin extends PluginAdapter {

    public static final String ID = "id";
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        String classAnnotation = "@ApiModel(value=\""+topLevelClass.getType().getShortName()+"\" ,description=\"" + introspectedTable.getRemarks()  + "\")";
        if(!topLevelClass.getAnnotations().contains(classAnnotation)) {
            topLevelClass.addAnnotation(classAnnotation);
        }

        String apiModelAnnotationPackage =  properties.getProperty("apiModelAnnotationPackage");
        String apiModelPropertyAnnotationPackage = properties.getProperty("apiModelPropertyAnnotationPackage");
        String apiModelData = properties.getProperty("apiModelData");
        if(null == apiModelAnnotationPackage) apiModelAnnotationPackage = "io.swagger.annotations.ApiModel";
        if(null == apiModelPropertyAnnotationPackage) apiModelPropertyAnnotationPackage = "io.swagger.annotations.ApiModelProperty";

        topLevelClass.addImportedType(apiModelAnnotationPackage);
        topLevelClass.addImportedType(apiModelPropertyAnnotationPackage);
        topLevelClass.addImportedType(apiModelData);

        field.addAnnotation("@ApiModelProperty(value=\"" +introspectedColumn.getRemarks() + "\")");
        if(ID.equals(introspectedColumn.getActualColumnName()))
        {
            field.addAnnotation("@TableId(type = IdType.AUTO)");
        }
        return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }
}
