package 泛型;

/**
 * @Classname FanXing002
 * @Description TODO
 * @Date 2019/10/23 14:59
 * @Created by HeYu5
 */

/*泛型方法（方法上含有泛型）
格式：
修饰符<泛型变量>返回值类型
* */
public class FanXing002<T> {
//    此方法上的泛型不是自己定义的，而是使用的类上的泛型
    public void print(T t){
        System.out.println(t);
    }

//    泛型方法 泛型E实在方法上自己定义的
    /*创建在方法上的泛型是在真正调用方法时确定的 一般由传入的参数确定
    * 包含这个方法类在类对象创建时 并不会确定方法上的类型 一定在调用方法时确定*/
    public <E> void show(E e){
        System.out.println(e);
    }

}