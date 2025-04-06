package  ${basePackage}.model;


import java.util.Scanner;
import lombok.Data;
/**
 * @author 12209
 * @date 2025/3/21 23:54
 * @className MainTemplateConfig
 */
@Data
public class DataModel {
  <#list modelConfig.models as modelInfo>
   <#if (modelInfo.description??)>
     /**
     * ${modelInfo.description}
     */
   </#if>
 private ${modelInfo.type} ${modelInfo.fieldName}<#if (modelInfo.defaultValue??)> = ${modelInfo.defaultValue?c}</#if>;
  </#list>



}
