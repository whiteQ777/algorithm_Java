package 剑指offer.T001单例模式;

/**
 * @Classname ShuangchongsuoSingleton
 * @Description TODO
 * @Date 2019/10/26 23:19
 * @Created by HeYu5
 */
public class ShuangchongsuoSingleton {
    /*采用双锁机制
    * 线程安全 延迟初始化
    * 在多线程情况下保持高性能
    * */

    //volatile作为指令关键字，确保本条指令不会因为编译器的优化而省略
    private volatile static ShuangchongsuoSingleton singleton;
    private ShuangchongsuoSingleton(){} //私有化构造
    
    public static ShuangchongsuoSingleton getSingleton(){
        if (singleton == null){
            synchronized (ShuangchongsuoSingleton.class){
                if (singleton == null){
                    singleton = new ShuangchongsuoSingleton();
                }
            }
        }
        return singleton;
    }
}