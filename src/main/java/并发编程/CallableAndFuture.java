package 并发编程;

import java.util.concurrent.*;

/**
 * @Classname CallableAndFuture
 * @Description TODO
 * @Date 2019/10/27 20:31
 * @Created by HeYu5
 */


/*运行Callable可以拿到一个Future对象
Future对象表示异步计算的结果,它提供了检查计算是否完成的方法
由于线程属于异步计算模型，因此无法从别的线程中得到函数的返回值
这种情况下就可以使用Future来监视目标线程调用call()方法的情况
当调用Future的get()方法获取结果时，当前线程会阻塞，直到call()方法结束返回结果
*/
public class CallableAndFuture {

    //创建线程类
    public static class CallableTest implements Callable<String>{
        public String call() throws Exception{
            return "Hello World!";
        }
    }

    public static void main(String[] args){
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        //启动线程
        Future<String> future = threadPool.submit(new CallableTest());

        System.out.println("waiting thread to finish");
        try {
            System.out.println(future.get());    //等待线程结束，并获取返回结果
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}