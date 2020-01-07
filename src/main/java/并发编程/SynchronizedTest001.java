package 并发编程;

/**
 * @Classname SynchronizedTest001
 * @Description TODO
 * @Date 2019/10/27 14:59
 * @Created by HeYu5
 */

//多个线程访问同一对象的同一方法
/*当两个线程同时对一个对象的方法进行操作 只有一个线程能够抢到锁
* 因为一个对象只有一把锁 一个线程获取该对象的锁之后 其他线程无法访问该对象的锁
* */

public class SynchronizedTest001 implements Runnable{
    /*
    * synchronized方法作用于实例方法
    * */

    //共享资源
    static int i = 0;

    //synchronized修饰实例方法

    public synchronized void increase(){
        i++;
    }

    public void run() {
        for (int j = 0; j < 10000; j++ ){
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest001 test = new SynchronizedTest001();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}