package com.yupi.cli.command;

import cn.hutool.core.bean.BeanUtil;

import com.yupi.model.DataModel;
import lombok.Data;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

/**
 * @author 12209
 * @date 2025/3/22 1:07
 */
@Command(name = "generate", description = "生成代码", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {
    @Option(
        names = {"-l", "--loop"},
        description = "�Ƿ�����ѭ��", 
        arity = "0..1",
        interactive = true,
        echo = true
    )
    private boolean loop = false;
    @Option(
        names = {"-a", "--author"},
        description = "����ע��", 
        arity = "0..1",
        interactive = true,
        echo = true
    )
    private String author = "yupi";
    @Option(
        names = {"-o", "--outputText"},
        description = "�����Ϣ", 
        arity = "0..1",
        interactive = true,
        echo = true
    )
    private String outputText = "sum = ";

    @Override
    public Integer call() throws Exception {
        System.out.println("author: " + author);
        DataModel mainTemplateConfig = new DataModel();
        BeanUtil.copyProperties(this, mainTemplateConfig);

        return 0;
    }
}