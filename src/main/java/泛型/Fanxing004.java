package 泛型;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;

/**
 * @Classname Fanxing004
 * @Description TODO
 * @Date 2019/10/23 16:31
 * @Created by HeYu5
 */
public class Fanxing004 {
    /*
    * 泛型在使用时必须左右一致，不存在继承
    * */
    public static void mian(String[] args) {
        ArrayList<?> list1;
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
//        ArrayList<Object> list4 = new ArrayList<String>(); //泛型在使用时必须左右一致，不存在继承

        list1 = list2; //不会报错，使用通配符， 通配符表示任意类型，
        list1 = list3;

    }

    public static void print1(ArrayList<Object> list){
//        使用了通配符里面的元素被限定了只能使用Object的方法
//        底层使用的是Object所以不能添加元素，因为不知道里面到底什么类型的元素
        list.add(new Object());
        list.get(0);
        list.remove(0);
        list.set(0, new Object());
        for (Object obj : list){
            System.out.println(obj);
        }
    }

    public static<E> void print2(E e, ArrayList<E> list){


    }

}