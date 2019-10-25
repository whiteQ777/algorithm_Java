package 数据结构;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname IteratorTest
 * @Description TODO
 * @Date 2019/10/24 19:46
 * @Created by HeYu5
 */

/*
 * 迭代器是一个对象，她的工作是遍历并选择序列中的对象，他提供了一种访问容器（container）对象中的各个元素，而又不暴露该对象
 * 内部细节的方法。通过迭代器，开发人员不需要了解容器底层的结构，就可以实现对容器的遍历
 * 由于创建迭代器的代价十分小，因此迭代器被称为轻量级容器
 * */
public class IteratorTest {
    /*Iterator支持派生的兄弟成员
    * ListIterator只存在于List中，支持在迭代期间向List中添加或者删除元素，并且可以在List中双向滚动
    * */
    public static void main(String[] args) {
        List<String> ll = new LinkedList<String>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("fourth");
        for(Iterator<String> iterator = ll.iterator();iterator.hasNext();){
            String str = (String) iterator.next();
            System.out.println(str);
        }
    }

}