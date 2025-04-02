package com.yupi.maker.meta;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 12209
 * @date 2025/3/25 1:03
 * @className Meta
 */
@NoArgsConstructor
@Data
public class Meta {
    private String name;
    private String description;
    private String basePackage;
    private String version;
    private String author;
    private String createTime;
    private FileConfig  fileConfig;
    private ModelConfig  modelConfig;



    @NoArgsConstructor
    @Data
    public static class FileConfig {
        private String inputRootPath;
        private String outputRootPath;
        private String type;
        private List<Fileinfo> files;

        @NoArgsConstructor
        @Data
        public static class Fileinfo {
            private String inputPath;
            private String outputPath;
            private String type;
            private String generateType;
        }
    }

    @NoArgsConstructor
    @Data
    public static class ModelConfig {
        private List<Modelsinfo> models;

        @NoArgsConstructor
        @Data
        public static class Modelsinfo {
            private String fieldName;
            private String type;
            private String description;
            private Object defaultValue;
            private String abbr;
        }
    }
}
