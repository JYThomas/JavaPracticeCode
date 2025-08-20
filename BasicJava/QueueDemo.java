// Part 7: 队列

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // 队列的使用场景：
        // 1. 先进先出（FIFO）：队列的典型应用场景，如排队买票、打印任务、CPU 调度等
        // 2. 广度优先搜索（BFS）：广度优先搜索算法的实现需要用到队列
        // 3. 并发控制：多线程环境下，线程间通信需要用到队列
        // 4. 任务调度：任务调度算法的实现需要用到队列
        // 5. 缓存：缓存算法的实现需要用到队列
        // 6. 消息队列：消息队列的实现需要用到队列

        // 队列的特点：
        // 1. 先进先出：队列中的元素按照先进先出的顺序排列，队首元素是最先进入队列的元素，队尾元素是最先离开队列的元素
        // 2. 元素唯一：队列中元素只能出现一次，不能重复
        // 3. 容量有限：队列的容量是有限的，当队列满时，不能再加入元素，当队列空时，不能再删除元素
        // 4. 线程安全：队列是线程安全的，可以在多线程环境下使用队列

        // 队列的操作：
        // 1. offer(e)：添加元素到队列尾部，如果队列已满，则抛出 IllegalStateException 异常
        // 2. poll()：移除队列头部的元素，如果队列为空，则返回 null
        // 3. peek()：查看队列头部的元素，如果队列为空，则返回 null
        // 4. element()：查看队列头部的元素，如果队列为空，则抛出 NoSuchElementException 异常
        // 5. add(e)：添加元素到队列尾部，如果队列已满，则阻塞直到队列有空闲位置
        // 6. remove()：移除队列头部的元素，如果队列为空，则抛出 NoSuchElementException 异常
        // 7. contains(e)：判断队列中是否包含指定的元素
        // 8. size()：返回队列中元素的个数
        // 9. isEmpty()：判断队列是否为空
        // 10. clear()：清空队列

        // 队列的实现：
        // 1. 数组实现：使用数组实现队列，数组的容量是固定的，当队列满时，不能再加入元素，当队列空时，不能再删除元素
        // 2. 链表实现：使用链表实现队列，链表的容量是不定的，当队列满时，链表尾部的元素被删除，当队列空时，链表头部的元素被删除


        // 队列的声明和初始化
        // Queue<String> queue = new LinkedList<String>();
        LinkedList<String> queue = new LinkedList<String>();
        // 元素入队列放于队尾
        queue.offer("Tom");
        queue.offer("Jerry");
        queue.offer("Mike");
        queue.offer("Lucy");

        // 输出队列
        System.out.println(queue);

        // 循环访问队列元素
        for (String name : queue) {
            System.out.println(name);
        }

        // 队列的长度
        System.out.println("队列的长度：" + queue.size());

        // 队列操作
        // 入队
        queue.offer("Jack");
        System.out.println("入队：Jack");
        System.out.println(queue);
        // 出队
        System.out.println("出队：" + queue.poll());
        System.out.println(queue);
        // 队列头部元素
        System.out.println("队列头部元素：" + queue.peek());
        // 队列尾部元素
        System.out.println("队列头部元素：" + queue.getLast());
        // 队列是否为空
        System.out.println("队列是否为空：" + queue.isEmpty());
        // 队列是否包含元素
        System.out.println("队列是否包含元素：" + queue.contains("Lucy"));
    }
}


