// Part 9: Set 集合

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SetDemo {
    public static void main(String[] args) {
        // 9. Set 集合：用于存储元素，元素不能重复，可以是不同类型的数据
        // 9.1 Set 集合的特点：
        // 1. 元素唯一：Set 集合中，每个元素只能出现一次 元素类型可以是不同类型的数据
        // 2. 无序性：Set 集合中的元素是无序的，不能通过索引访问元素
        // 3. 线程安全：Set 集合是线程安全的，可以在多线程环境下使用 Set 集合
        // 4. 允许 null 值：Set 集合中的元素可以为 null
        // hashset和set的区别： hashset是set的子类，set是集合的父类，hashset是线程安全的，set不是线程安全的

        // 9.2 Set 集合的实现：
        // 1. HashSet：HashSet 是 Set 集合的一种实现，它是基于哈希表的 Set 集合，具有很快的访问速度，同时也允许 null 值
        // 2. TreeSet：TreeSet 是 Set 集合的另一种实现，它是基于红黑树的 Set 集合，具有排序功能，同时也允许 null 值

        // 9.3 Set 集合的声明和初始化
        HashSet demoSet = new HashSet<>();
        demoSet.add("Tom");
        demoSet.add(2);
        System.out.println(demoSet); // [Tom, 2]

        // Set<String> set = new HashSet<String>();
        // 声明一个 HashSet 集合，元素是 String 类型
        HashSet<String> nameSet = new HashSet<String>();
        // 元素添加到 Set 集合
        nameSet.add("Tom");
        nameSet.add("Jerry");
        nameSet.add("Mike");
        nameSet.add("Lucy");
        nameSet.add("Tommy"); // 重复元素

        // 9.4 Set 集合的遍历
        // 遍历 Set 集合的元素
        for (String name : nameSet) {
            System.out.println(name);
        }
        System.out.println();

        // 9.5 Set 集合的操作
        // 1. add(e)：添加元素到 Set 集合，如果元素已存在，则不添加
        nameSet.add("Jack");
        System.out.println(nameSet); // Tom, Jerry, Mike, Lucy, Jack
        // 2. remove(e)：移除 Set 集合中的元素，如果元素不存在，则抛出 NoSuchElementException 异常
        nameSet.remove("Lucy");
        System.out.println(nameSet); // Tom, Jerry, Mike, Jack
        // 3. contains(e)：判断 Set 集合中是否包含指定的元素
        System.out.println(nameSet.contains("Lucy")); // false
        // 4. size()：返回 Set 集合中元素的个数
        System.out.println(nameSet.size()); // 4
        // 5. isEmpty()：判断 Set 集合是否为空
        System.out.println(nameSet.isEmpty()); // false
        // 6. clear()：清空 Set 集合中的所有元素
        nameSet.clear();
        System.out.println(nameSet.isEmpty()); // true  

        // 9.6 Set 集合的常用方法
        // 字面量初始化
        Set<String> nameSet2 = new HashSet<String>(Arrays.asList("Tom", "Jerry", "Mike", "Lucy"));
        Set<String> nameSet3 = new HashSet<String>(Arrays.asList("Tom", "Jeffery", "Mike", "Lucie"));
        // 集合取交集
        Set<String> intersection = new HashSet<String>(nameSet2);
        intersection.retainAll(nameSet3);
        System.out.println(intersection); // Tom, Mike
        // 集合取并集
        Set<String> union = new HashSet<String>(nameSet2);
        union.addAll(nameSet3);
        System.out.println(union); // Tom, Jerry, Mike, Jeffery, Lucie
        // 集合取差集
        Set<String> difference = new HashSet<String>(nameSet2);
        difference.removeAll(nameSet3);
        System.out.println(difference); // Tom, Lucy
    }
}
