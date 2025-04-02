package cn.first;

/**
 * @author 12209
 * @date 2025/4/1 16:49
 * @className text
 */
public class text extends Variate{
    public static void main(String[] args) {
        Variate.name="张三";
        Variate s1=new Variate();
        s1.name="李四";
        System.out.println(Variate.name);
        Variate s2=new Variate();
        System.out.println(s2.name);
        Variate s3=new Variate();
        s3.name="赵六";
        System.out.println(s3.name);
    }
}
