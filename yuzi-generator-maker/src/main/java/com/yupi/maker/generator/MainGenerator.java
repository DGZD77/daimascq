package com.yupi.maker.generator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.template.TemplateException;
import com.yupi.maker.generator.file.DynamicFileGenerator;
import com.yupi.maker.meta.Meta;
import com.yupi.maker.meta.MetaManager;

import java.io.File;
import java.io.IOException;

public class MainGenerator {

    public static void main(String[] args) throws Exception {
         String inputFilePath;
      String outputFilePath;
      Meta meta = MetaManager.getMetaObject();
      String projectPath=System.getProperty("user.dir");
      String parentPath = new File(projectPath).getParent();
      String inputResourcePath=parentPath+File.separator+meta.getFileConfig().getInputRootPath();
      String outputBaseJavaPackagePath = projectPath+File.separator+meta.getFileConfig().getOutputRootPath();
    	// generator.DynamicGenerator
        inputFilePath = inputResourcePath + File.separator + "templates/java/generator/DynamicGenerator.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/acm-template-pro-generator/src/main/java/com/yupi/generated/DynamicGenerator.java";
      System.out.println(outputFilePath);
      System.out.println(inputFilePath);
        DynamicFileGenerator.doGenerate(inputFilePath , outputFilePath, meta);

        // generator.MainGenerator
        inputFilePath = inputResourcePath + File.separator + "templates/java/generator/MainGenerator.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/acm-template-pro-generator/src/main/java/com/yupi/generated/MainGenerator.java";
        DynamicFileGenerator.doGenerate(inputFilePath , outputFilePath, meta);

        // generator.StaticGenerator
        inputFilePath = inputResourcePath + File.separator + "templates/java/generator/StaticGenerator.java.ftl";
        outputFilePath = outputBaseJavaPackagePath + "/acm-template-pro-generator/src/main/java/com/yupi/generated/StaticGenerator.java";
        DynamicFileGenerator.doGenerate(inputFilePath , outputFilePath, meta);
    }
}
