package com.yupi.cli.command;

import picocli.CommandLine;
import picocli.CommandLine.Command;

/**
 * @author 12209
 * @date 2025/3/22 1:34
 * @className CommandExecutor
 */
@Command(name = "yuzi", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable{
    private final CommandLine commandLine;
    {
        commandLine = new CommandLine(this)
                   .addSubcommand(new GenerateCommand())
                   .addSubcommand(new ListCommand())
                   .addSubcommand(new ConfigCommand());


    }
    @Override
    public void run() {
        System.out.println("请输入具体指令，或者输入--help查看帮助信息");
    }
    public Integer doExecute(String [] args){
        return commandLine.execute(args);
    }
}
