package com.yupi.maker.generator.file;

import com.yupi.maker.generator.file.DynamicFileGenerator;
import com.yupi.maker.model.DataModel;

import java.io.File;

/**
 * @author 12209
 * @date 2025/3/22 0:18
 * @className MainGenerator
 */
public class FileGenerator {
    public static void doGenerator (Object model) throws Exception {
         String  projectPath=System.getProperty("user.dir");
    File parentFile=new File(projectPath).getParentFile();
    String inputPath=parentFile+File.separator+"yuzi-generator-demo-projects/acm-template";
        System.out.println(inputPath);
    String outputPath=File.separator+parentFile;
     StaticFileGenerator.copyFilesByHutool(inputPath,outputPath);
     String inputDynamicPath=projectPath+File.separator+"src/main/resources/templates/MainTemplate.html.ftl";
     String outputDynamicPath=parentFile+File.separator+"acm-template/src/com/yupi/acm/MainTemplate.java";
     DynamicFileGenerator.doGenerate(inputDynamicPath,outputDynamicPath,model);
    }

    public static void main(String[] args) throws Exception {
        DataModel mainTemplateConfig=new DataModel();
        mainTemplateConfig.setAuthor("lakoka");
        mainTemplateConfig.setOutputText("逆天");
        mainTemplateConfig.setLoop(true);
        doGenerator(mainTemplateConfig);
    }

}
