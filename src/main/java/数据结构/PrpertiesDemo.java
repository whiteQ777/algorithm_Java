package 数据结构;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @Classname PrpertiesDemo
 * @Description TODO
 * Properties 继承了hashtable标识一个持久的属性集 属性列表中每个键及其对应值都是一个字符串
 * @Date 2019/10/21 22:37
 * @Created by HeYu5
 */
public class PrpertiesDemo {

    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington","Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

//        Show all states and capitals in hashtable
        states = capitals.keySet();   //get set-view of keys
        Iterator itr = states.iterator();
        while (itr.hasNext()){
            str = (String) itr.next();
            System.out.println("The capital of " + str + " is " + capitals.get(str));
        }
        System.out.println();

//        look for state not in list --specify default
        str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The Capital of Florida is " + str);
    }
}