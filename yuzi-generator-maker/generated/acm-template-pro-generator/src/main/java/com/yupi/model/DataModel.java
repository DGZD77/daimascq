package  com.yupi.model;


import java.util.Scanner;
import lombok.Data;
/**
 * @author 12209
 * @date 2025/3/21 23:54
 * @className MainTemplateConfig
 */
@Data
public class DataModel {
     /**
     * 是否生成循环
     */
 private boolean loop = false;
     /**
     * 作者注释
     */
 private String author = "yupi";
     /**
     * 输出信息
     */
 private String outputText = "sum = ";



}
