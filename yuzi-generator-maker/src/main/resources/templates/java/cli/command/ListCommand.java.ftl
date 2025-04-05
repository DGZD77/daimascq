package ${basePackage}.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine.Command;

import java.io.File;
import java.util.List;

/**
 * @author 12209
 * @date 2025/3/22 1:25
 * @className ListCommand
 */
@Command(name = "list", description = "list all tasks")
public class ListCommand implements Runnable{

    @Override
    public void run() {

        String inputPath="${fileConfig.inputRootPath}"
        System.out.println("inputPath:"+inputPath);
        List<File> files= FileUtil.loopFiles(inputPath);
        for (File file : files){
            System.out.println(file);
        }
    }
}
