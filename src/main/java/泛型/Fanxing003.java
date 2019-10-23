package 泛型;

/**
 * @Classname Fanxing003
 * @Description TODO
 * @Date 2019/10/23 16:17
 * @Created by HeYu5
 */

/*泛型接口
* 格式
* public static interface 接口名<泛型变量>{
*   抽象方法
* }
* */
public interface Fanxing003<T> {
    //抽象方法
    public abstract void print(T t);

}
