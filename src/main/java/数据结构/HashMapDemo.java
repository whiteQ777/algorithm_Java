package 数据结构;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Classname HashMapDemo
 * @Description TODO
 * @Date 2019/10/26 17:08
 * @Created by HeYu5
 */

class Person{
    String id;
    String name;
    public int hashCode(){
        return id.hashCode();
    }

    public Person(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "id =" + id + ", name=" + name;
    }

    //重写equals方法
    public boolean equals(Object obj){
        Person p = (Person)obj;
        if(p.id.equals(this.id)){
            return true;
        }
        else{
            return false;
        }
    }
}



public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("Use user defined class as key: ");
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("aaa","bbb");
        hm.put("aaa","ccc");

        // entrySet()返回一个保存键值对的set集合
        Iterator iter = hm.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String)entry.getKey();
            String val = (String)entry.getValue();
            System.out.println(key + "   " + val);
        }
    }



}