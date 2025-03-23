package com.yupi.command;

import cn.hutool.core.bean.BeanUtil;
import com.yupi.generator.DynamicGenerator;
import com.yupi.generator.MainGenerator;
import com.yupi.model.MainTemplateConfig;
import lombok.Data;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

/**
 * @author 12209
 * @date 2025/3/22 1:07
 * @className GeneratorCommand
 */
@Command(name = "generate", description = "生成代码", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {
    @Option(names = {"-a", "--author"}, description = "作者",arity = "0..1",interactive = true,echo = true)

     private String author="12209";
     @Option(names = {"-o", "--output"}, description = "输出文本",arity = "0..1",interactive = true,echo = true)
    private String outputText="hh";
     @Option(names = {"-l", "--loop"}, description = "循环生成",arity = "0..1",interactive = true,echo = true)
     private boolean loop=true;

    @Override
    public Integer call() throws Exception {
        System.out.println("author:"+author);
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        BeanUtil.copyProperties(this,mainTemplateConfig);
        MainGenerator.doGenerator(mainTemplateConfig);
         return  0;
    }
}


