package com.yupi.cli.command;

import cn.hutool.core.util.ReflectUtil;
import com.yupi.model.DataModel;
import picocli.CommandLine.Command;

import java.lang.reflect.Field;

/**
 * @author 12209
 * @date 2025/3/22 1:30
 * @className ConfigCommand
 */
@Command(name = "config",mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable{
    @Override
    public void run() {
        Field[] fields= ReflectUtil.getFields(DataModel.class);
        for (Field field : fields) {
            System.out.println("字段名称"+field.getName());
            System.out.println("字段类型"+field.getType());
            System.out.println("---------------------------");
        }
    }
}
