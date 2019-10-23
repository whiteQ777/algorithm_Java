package 泛型;

/**
 * @Classname FanXing001
 * @Description TODO
 * @Date 2019/10/23 14:52
 * @Created by HeYu5
 */
public class FanXing001<E> {
    /*
    * 定义具有泛型的类
    * 修饰符class 类型<泛型变量>{}
    * 泛型变量一般用E , K, V ,T
    * */
    private E e;

    public FanXing001(){}

    public FanXing001(E e){
        this.e = e;
    }

    public E getE(){
        return e;
    }

    public void setE(){
        this.e = e;
    }

    @Override
    public String toString() {
        return "FanXing001{" +
                "e=" + e +
                '}';
    }
}