package 并发编程;

/**
 * @Classname SynchronizedTest002
 * @Description TODO
 * @Date 2019/10/27 16:03
 * @Created by HeYu5
 */
public class SynchronizedTest002 {
    public synchronized void method1(){
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public synchronized void method2(){
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }

    public static void main(String[] args) {
        final SynchronizedTest002 test = new SynchronizedTest002();

        new Thread(new Runnable() {   //匿名内部类 当不需要重用代码时
            public void run() {
                test.method1();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                test.method2();
            }
        }).start();
    }



}