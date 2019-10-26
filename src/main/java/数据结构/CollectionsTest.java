package 数据结构;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname CollectionsTest
 * @Description TODO
 * @Date 2019/10/26 23:06
 * @Created by HeYu5
 */
/*
* Collections是针对集合类的一个包装类，提供一系列静态方法来实现对各种集合的搜索、排序、线程安全化等操作
* 大多数方法都是用来处理线性表
* Collections不能实例化 服务于Collection框架
* 若在使用Collections方法时，对应的Collection对象为null，则抛出空指针异常
* */

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        int[] array = {1, 7, 3, 2};
        for (int i = 0; i < array.length; i++){
            list.add(new Integer(array[i]));
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}