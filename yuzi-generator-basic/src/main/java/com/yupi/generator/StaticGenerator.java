package com.yupi.generator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * @author 12209
 * @date 2025/3/21 22:48
 * @className StaticGenerator
 */
public class StaticGenerator {
     public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
    public static void copyFilesByRecoursive(String inputPath, String outputPath) {
        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);
        try {
            copyFileRyRecoursive(inputFile, outputFile);
        } catch (Exception e) {
            System.out.println("件复制失败");
        }
    }

    private static void copyFileRyRecoursive(File inputFile, File outputFile) {

        if (inputFile.isDirectory()) {
            File destOutputFile = new File(outputFile, inputFile.getName());
            if (!destOutputFile.exists()) {
                destOutputFile.mkdirs();
            }

            File[] files = inputFile.listFiles();//会获取inputFile目录下的所有文件和文件夹
                if (ArrayUtil.isEmpty(files)){
                     return;
                }
            for (File file : files) {
                copyFileRyRecoursive(file, destOutputFile);


            }
        }else{
            Path destPath=outputFile.toPath().resolve(inputFile.getName());
            FileUtil.copy(inputFile.toPath(),destPath, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    public static void main(String[] args) {

    }
}
