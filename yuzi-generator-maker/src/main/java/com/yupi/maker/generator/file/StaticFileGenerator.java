package com.yupi.maker.generator.file;

import cn.hutool.core.io.FileUtil;

/**
 * @author 12209
 * @date 2025/3/21 22:48
 * @className StaticFileGenerator
 */
public class StaticFileGenerator {
     public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

}
