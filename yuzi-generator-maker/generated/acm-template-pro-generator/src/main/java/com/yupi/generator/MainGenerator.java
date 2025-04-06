package com.yupi.generator;

import com.yupi.model.DataModel;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成�?
 */
public class MainGenerator {

    /**
     * 生成
     *
     * @param model 数据模型
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        String intputRoot="yuzi-generator-maker/src/main/resources";
        String outputRoot="generated";
        String inputPath;
        String outputPath;
        // 生成实体�?
               inputPath = new File(intputRoot, "src/com/yupi/acm/MainTemplate.java.ftl").getAbsolutePath();
                outputPath = new File(outputRoot, "src/com/yupi/acm/MainTemplate.java").getAbsolutePath();
                DynamicGenerator.doGenerate(inputPath, outputPath, model);
               inputPath = new File(intputRoot, ".gitignore").getAbsolutePath();
                outputPath = new File(outputRoot, ".gitignore").getAbsolutePath();
                StaticGenerator.copyFilesByHutool(inputPath, outputPath);
               inputPath = new File(intputRoot, "README.md").getAbsolutePath();
                outputPath = new File(outputRoot, "README.md").getAbsolutePath();
                StaticGenerator.copyFilesByHutool(inputPath, outputPath);
    }
}
