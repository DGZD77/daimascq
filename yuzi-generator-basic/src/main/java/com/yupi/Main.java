package com.yupi;

import com.yupi.command.CommandExecutor;

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
        if (args.length == 0) {
            args = new String[]{"list"}; // 默认参数
        }
         for(int i=0;i<args.length;i++){
            System.out.println("args["+i+"]="+args[i]);
        }
        CommandExecutor commandExecutor = new CommandExecutor();
        System.out.println(args[0]);
        commandExecutor.doExecute(args);
    }
}


