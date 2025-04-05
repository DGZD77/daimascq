package ${basePackage}.generator;

import com.yupi.model.DataModel;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
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
        String intputRoot=${fileConfig.inputRootPath};
        String outputRoot=${fileConfig.outputRootPath};
        String inputPath;
        String outputPath;
        // 生成实体类
        <#list fileConfig.files as fileInfo>
               intputPath = new File(intputRoot, "${fileInfo.inputPath}").getAbsolutePath();
                outputPath = new File(outputRoot, "${fileInfo.outputPath}").getAbsolutePath();
            <#if fileInfo.generateType=="static">
                StaticFileGenerator.copyFilesByGutool(intputPath, outputPath);
            <#else>
                DynamicGeneratir.doGenerate(intputPath, outputPath, model);
            </#if>
        </#list>
    }
}
