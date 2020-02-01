package 剑指offer;

import java.util.Stack;

/**
 * @Classname stackToQueque
 * @Description TODO
 * @Date 2020/1/16 11:39
 * @Created by HeYu5
 */
public class stackToQueque {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int n){
        stack1.push(n);
    }

    public int pop() {
        if (stack2.empty()) {
            while (stack1.empty() != true) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.empty() == true) {
            return -1;
        }
        return stack2.pop();
    }
}