package 数据结构;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @Classname HashTableDemo
 * @Description TODO
 * hashtable是原始java.util的一部分，是Dictionary具体的实现
 * 但是 java2之后 hashtable实现了map接口 因此hashtable整合到集合框架中
 * hashtable和hashmap类似 但是hashtable支持同步
 * @Date 2019/10/21 21:53
 * @Created by HeYu5
 */
public class HashTableDemo {

    public static void main(String[] args) {
//        create a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara", new Double(3434.34));
        balance.put("Mahnaz", new Double(123.32));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));

//        show all balance in hash table
        names = balance.keys();
        while (names.hasMoreElements()){
            str = (String)names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        //Deposit 1,000 into zara's account
        bal = ((Double)balance.get("Zara")).doubleValue();
        balance.put("Zara", new Double(bal + 1000));
        System.out.println("zara's new balance: " + balance.get("Zara"));
    }

}