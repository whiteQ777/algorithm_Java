package 数据结构;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname MapDemo
 * @Description TODO
 * @Date 2019/10/21 21:44
 * @Created by HeYu5
 */
public class MapDemo {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahanaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
//        m1.put("Daisy", "15");
        System.out.println();
        System.out.println( "Map Elements");
        System.out.println( m1);

//        m1.clear();
        System.out.println(m1.containsKey("Zara1"));
        System.out.println(m1.entrySet());
        m1.remove("Zara");
        System.out.println(m1);
    }
}