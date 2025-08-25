// Part3:多线程示例2,接收多线程执行函数的返回值

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.HashMap;
import java.util.Map;

public class MultithreadsDemo2 {
    public static void main(String[] args) {

        /*
         * 多线程执行并获取返回值的示例流程 
         * 创建线程池对象，设置大小
         * 线程池对象提交任务，executorService.submit()方法返回一个Future对象，用于获取任务的返回值。submit后会自动分配线程执行任务，执行类中实现的call()方法。
         * 调用Future对象的get()方法获取任务的返回值。
         * 调用ExecutorService对象的shutdown()方法关闭线程池。
         * 调用ExecutorService对象的awaitTermination()方法等待所有任务完成。
        */

        ExecutorService executorService = Executors.newFixedThreadPool(3);  // 创建一个固定大小的线程池

        // 提交一个返回整型的任务
        Future<Integer> intFuture = executorService.submit(new IntTask(5));

        // 提交一个返回字符串的任务
        Future<String> stringFuture = executorService.submit(new StringTask("Hello"));

        // 提交一个返回字典格式的任务
        Future<Map<String, Object>> mapFuture = executorService.submit(new MapTask());
 
        // 获取每个任务的结果
        try {
            // 获取整型任务的返回值
            Integer intResult = intFuture.get();  // 获取整型任务的返回值
            System.out.println("Result of IntTask: " + intResult);

            // 获取字符串任务的返回值
            String stringResult = stringFuture.get();  // 获取字符串任务的返回值
            System.out.println("Result of StringTask: " + stringResult);

            // 获取字典任务的返回值
            Map<String, Object> mapResult = mapFuture.get();  // 获取字典任务的返回值
            System.out.println("Result of MapTask: " + mapResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 关闭线程池(shutdown)的输出效果为：
        // 输出完执行结果输出，然后输出获取返回值后的内容，然后直接退出。

        // 不关闭线程池(shutdown)的输出效果为：
        // 输出完执行结果输出，然后输出获取返回值后的内容，然后等10秒后才退出。
        // 因此，这里建议关闭线程池，否则会导致程序卡死。卡死的原因是线程池中的线程不会退出，一直处于等待状态，不会退出的原因是没有可执行任务进来。
        executorService.shutdown();  // 关闭线程池

        // 等待所有任务完成，这里设置了10秒的等待时间，如果任务没有完成，则主线程会等待10秒后退出。
        // 如果没有设置等待时间，主线程则会一直等待，直到所有任务完成。
        try {
            // 第一个参数为等待时间，第二个参数为时间单位，这里是1秒
            executorService.awaitTermination(1, TimeUnit.SECONDS);  // 等待所有任务完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// 返回整型的任务
// Callable接口的call()方法返回值类型为泛型T，这里是Integer
class IntTask implements Callable<Integer> {
    private int number;

    public IntTask(int number) {
        this.number = number;
    }

    @Override
    /*
     * public Integer call() throws Exception 这种写法的效果是，子类必须实现call()方法，并且必须抛出Exception异常，否则无法编译通过。
     * 这里的异常是为了让子类知道自己是如何处理异常的。当出现异常时，会自动抛出给父类，父类会捕获异常并处理。如果子类没有处理异常，父类会把异常抛给调用者。
    */
    public Integer call() throws Exception {
        System.out.println("Thread " + Thread.currentThread().getId() + " is calculating the square of " + number);
        TimeUnit.SECONDS.sleep(10);  // 模拟耗时操作
        return number * number;
    }
}

// 返回字符串的任务
// Callable接口的call()方法返回值类型为泛型T，这里是String
class StringTask implements Callable<String> {
    private String message;

    public StringTask(String message) {
        this.message = message;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Thread " + Thread.currentThread().getId() + " is processing the string: " + message);
        TimeUnit.SECONDS.sleep(1);  // 模拟耗时操作
        return message.toUpperCase();
    }
}

// 返回字典格式的任务
// Callable接口的call()方法返回值类型为泛型T，这里是Map<String, Object>,key为字符串String，value为任意类型Object
class MapTask implements Callable<Map<String, Object>> {
    @Override
    public Map<String, Object> call() throws Exception {
        System.out.println("Thread " + Thread.currentThread().getId() + " is creating a map");
        TimeUnit.SECONDS.sleep(1);  // 模拟耗时操作
        // 创建一个字典
        Map<String, Object> map = new HashMap<>();
        map.put("name", "John Doe");
        map.put("age", 30);
        map.put("city", "New York");
        return map;
    }
}
