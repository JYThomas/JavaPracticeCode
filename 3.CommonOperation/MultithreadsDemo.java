// Part2:多线程示例

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * 三个导入的包分别为：
 * java.util.concurrent.ExecutorService: 线程池管理器，作用是管理线程池，创建线程池，执行线程任务等。
 * java.util.concurrent.Executors: 线程池工厂类，作用是创建线程池。
 * java.util.concurrent.TimeUnit: 时间单位，作用是定义时间的单位。
*/
 
// 银行账户类
class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    // 存款方法
    // 关键字synchronized用于保证线程安全，保证同一时间只有一个线程可以访问该方法
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", new balance is " + balance);
    }

    // 取款方法
    // 关键字synchronized用于保证线程安全，保证同一时间只有一个线程可以访问该方法
    public synchronized boolean withdraw(int amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ", new balance is " + balance);
        return true;
    }
}

// 存款任务类
class DepositTask implements Runnable {
    // 声明了一个account对象
    private Account account;
    private int amount;

    public DepositTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    // 存款任务类实现了Runnable接口，重写了run方法，用于执行存款任务
    // Runnable接口的run方法是线程执行体，在线程池中执行的任务必须实现该接口,定义了多线程方法
    @Override
    public void run() {
        account.deposit(amount);
    }
}

// 取款任务类
class WithdrawTask implements Runnable {
    private Account account;
    private int amount;

    public WithdrawTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (!account.withdraw(amount)) {
            System.out.println("Insufficient balance for withdrawal of " + amount);
        }
    }
}

public class MultithreadsDemo {
    public static void main(String[] args) {
        Account account = new Account(1000);  // 初始化账户余额为1000
        ExecutorService executorService = Executors.newFixedThreadPool(5);  // 创建一个固定大小的线程池

        // 提交多个存款任务
        for (int i = 0; i < 10; i++) {
            // submit方法用于提交任务，参数为Runnable接口的实现类对象,构造函数初始化参数为初始余额和存款金额
            // submit方法返回一个Future接口对象，用于获取任务执行结果
            executorService.submit(new DepositTask(account, 100));
            // 执行顺序为DepositTask构建了一个对象，然后submit到线程池中，线程池会 自动分配线程执行 DepositTask中重写的run方法
        }

        // 提交多个取款任务
        for (int i = 0; i < 10; i++) {
            // submit方法用于提交任务，参数为Runnable接口的实现类对象
            executorService.submit(new WithdrawTask(account, 200));
        }

        /*
         * 输出没有完全按顺序进行，这是因为多线程程序的执行顺序是不确定的。
         * 多线程的执行依赖于操作系统的线程调度机制，因此无法保证任务会严格按照提交的顺序执行
         * 多线程执行顺序不可测，我们要的就是关注结果，提高执行的并发，比如要多线程爬取链接，我主要关心爬回来的内容，而不是执行的顺序。
         * 我要的是节约顺序执行阻塞耗时任务的时间，提高执行效率。
         * 
         * 执行顺序：具体类实现Runnable接口，重写了run方法，在主函数中将Runnable对象提交到线程池中，线程池会自动分配线程执行run方法。
         * 线程池的大小为5，因此最多只能同时执行5个任务。
         * 线程池的线程数量是可以动态调整的，可以通过Executors.newFixedThreadPool(int nThreads)方法创建线程池，参数为线程数量。
         * 线程池的线程数量可以通过线程池对象的setMaximumPoolSize(int maxSize)方法动态调整。
         * 线程池的线程数量可以通过线程池对象的shutdown()方法来关闭线程池，调用该方法后，线程池不再接受新的任务，但仍在执行已提交的任务。
         * 调用线程池对象的shutdownNow()方法可以立即关闭线程池，不管任务是否完成，立即停止所有线程的执行。
         * 调用线程池对象的awaitTermination(long timeout, TimeUnit unit)方法可以等待线程池中所有任务完成，参数为超时时间，单位为TimeUnit。
         * 调用线程池对象的isTerminated()方法可以判断线程池是否已经关闭。
        */

        executorService.shutdown();  // 关闭线程池
        try {
            // awaitTermination方法用于等待线程池中所有任务完成，参数为超时时间，单位为TimeUnit
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
