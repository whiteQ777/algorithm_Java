package 数据结构;


import java.util.Stack;

/**
 * @Classname StackDemo
 * @Description TODO
 * 栈是vector的一个子类 实现了标准的先进后出的栈
 * @Date 2019/10/21 18:06
 * @Created by HeYu5
 */
public class StackDemo {
    static void showpush(Stack<Integer> st, int a){
        st.push(new Integer(a));
        System.out.println("push (" + a + ")");
        System.out.println("stack" + st);
    }

    static void showpop(Stack<Integer> st){
        System.out.print("pop -->  ");
        Integer a  = (Integer)st.pop();
        System.out.println(a);
        System.out.println("stack " + st);
    }

    static void showsearch(Stack<Integer> st, int a){
//        栈的索引是从上往下数的
        System.out.println(a + "is " + st.search(new Integer(a)));
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack:  " + st);
        showpush(st, 1);
        showpush(st, 2);
        showpush(st, 3);
        showpush(st, 4);
        showsearch(st, 2);
        showpop(st);


    }
}