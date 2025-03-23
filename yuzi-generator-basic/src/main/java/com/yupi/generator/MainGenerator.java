package com.yupi.generator;

import cn.hutool.extra.template.TemplateException;
import com.yupi.model.MainTemplateConfig;

import java.io.File;
import java.io.IOException;

/**
 * @author 12209
 * @date 2025/3/22 0:18
 * @className MainGenerator
 */
public class MainGenerator {
    public static void doGenerator (Object model) throws Exception {
         String  projectPath=System.getProperty("user.dir");
    File parentFile=new File(projectPath).getParentFile();
    String inputPath=parentFile+File.separator+"yuzi-generator-demo-projects/acm-template";
        System.out.println(inputPath);
    String outputPath=File.separator+parentFile;
     StaticGenerator.copyFilesByHutool(inputPath,outputPath);
     String inputDynamicPath=projectPath+File.separator+"src/main/resources/templates/myweb.html.ftl";
     String outputDynamicPath=parentFile+File.separator+"acm-template/src/com/yupi/acm/MainTemplate.java";
     DynamicGenerator.doGenerate(inputDynamicPath,outputDynamicPath,model);
    }

    public static void main(String[] args) throws Exception {
        MainTemplateConfig mainTemplateConfig=new MainTemplateConfig();
        mainTemplateConfig.setAuthor("lakoka");
        mainTemplateConfig.setOutputText("逆天");
        mainTemplateConfig.setLoop(true);
        doGenerator(mainTemplateConfig);
    }

}
