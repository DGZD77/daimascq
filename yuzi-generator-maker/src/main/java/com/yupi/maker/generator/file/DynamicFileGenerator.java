package com.yupi.maker.generator.file;

import cn.hutool.core.io.FileUtil;
import com.yupi.maker.model.DataModel;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * @author 12209
 * @date 2025/3/21 23:55
 * @className DynamicGenerator
 */
public class DynamicFileGenerator {
   public static void doGenerate(String inputPath,String outputPath,Object model) throws Exception, TemplateException {
        // 1. 读取配置文件
        // 2. 根据配置文件生成代码
        // 3. 生成代码
// new 出 Configuration 对象，参数为 FreeMarker 版本号
       System.out.println("??? "+outputPath);
   Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
   File  templatrDir=new File(inputPath).getParentFile();

  // 指定模板文件所在的路径
    configuration.setDirectoryForTemplateLoading(templatrDir);
    String templateName=new File(inputPath).getName();

        Template template = configuration.getTemplate(templateName);

  // 设置模板文件使用的字符集
     configuration.setDefaultEncoding("utf-8");
       System.out.println(outputPath);
          if (!FileUtil.exist(outputPath)) {
            FileUtil.touch(outputPath);
              System.out.println(outputPath+"不存在");
        }
        Writer  out=new FileWriter(outputPath);
        template.process(model,out);
        out.close();
    }
}
