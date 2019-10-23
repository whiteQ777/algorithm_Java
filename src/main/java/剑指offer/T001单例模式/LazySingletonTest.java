package 剑指offer.T001单例模式;

/**
 * @Classname LazySingletonTest
 * @Description TODO
 * @Date 2019/10/23 22:09
 * @Created by HeYu5
 */
public class LazySingletonTest {
    /*
    * 懒汉模式 线程不安全，延迟初始化，严格意义上不是单例模式
    * */
    private static LazySingletonTest ourInstance;

    private LazySingletonTest(){}; //私有化构造

    private static LazySingletonTest getInstance(){
        if (ourInstance == null){
            ourInstance = new LazySingletonTest();
        }
        return ourInstance;
    }

}