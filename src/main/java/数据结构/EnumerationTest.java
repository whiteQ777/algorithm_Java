package 数据结构;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Classname EnumerationTest
 * @Description TODO
 * Enumeration 接口 定义了一些方法
 * hasMoreElements()测试此列举是否包含更多元素
 * nextElement() 如果列举对象至少还有一个可提供的元素，则返回此枚举的下一个元素
 * @Date 2019/10/21 15:21
 * @Created by HeYu5
 */
public class EnumerationTest {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("sunday");
        dayNames.add("monday");
        dayNames.add("tuesday");
        dayNames.add("wednesday");
        dayNames.add("thursday");
        dayNames.add("friday");
        dayNames.add("saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}