package 剑指offer.T001单例模式;

/**
 * @Classname HungerSingletonTest
 * @Description TODO
 * @Date 2019/10/23 22:03
 * @Created by HeYu5
 */
public class HungerSingletonTest {
    /*单例模式确保某个类仅有一个实例
     * 要求：
     *       类构造器私有
     *       持有自己类型的属性；
     *       对外提供获取实例的静态方法；

     *
     * 单例模式的应用：
     *   在计算机系统中，线程池、缓存，日志对象，对话框，打印机，显卡驱动程序对象常被设计成单例。
     *   每台计算机可以有若干个打印机，但只能有一个Printer Spooler，以避免两个打印作业同时输出到打印机中。
     *   每台计算机可以有若干通信端口，系统应当集中管理这些通信端口，以避免一个通信端口同时被两个请求同时调用。总之，选择单例模式就是为了避免不一致状态。
     * */


    //    饿汉式: 线程安全，但是一开始就初始化，消耗资源，容易产生垃圾
    private static final HungerSingletonTest ourInstance = new HungerSingletonTest();

    public static HungerSingletonTest getInstance(){
        return ourInstance;
    }

    private HungerSingletonTest(){}  //私有化构造

}