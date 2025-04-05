package ${basePackage}.maker;

import ${basePackage}.cli.command.CommandExecutor;

/**
 * @author 12209
 * @date 2025/3/22 1:43
 * @className Main
 */
public class Main {

    public static void main(String[] args) {
        //args = new String[]{"generate", "-l", "-a", "-o"};
//        args = new String[]{"config"};
      // args = new String[]{"list"};

        CommandExecutor commandExecutor = new CommandExecutor();
        System.out.println(args[0]);
        commandExecutor.doExecute(args);
    }
}


