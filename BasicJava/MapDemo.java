// Part 8: Map 集合

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // 8. Map 集合：用于存储键值对，键和值可以是不同类型的数据
        // 8.1 Map 集合的特点：
        // 1. 键值对唯一：Map 集合中，每个键只能对应唯一的值
        // 2. 无序性：Map 集合中的元素是无序的，不能通过索引访问元素
        // 3. 线程安全：Map 集合是线程安全的，可以在多线程环境下使用 Map 集合
        // 4. 允许 null 值：Map 集合中的键和值可以为 null

        // 8.2 Map 集合的实现：
        // 1. HashMap：HashMap 是 Map 集合的一种实现，它是基于哈希表的 Map 集合，具有很快的访问速度，同时也允许 null 值
        // 2. TreeMap：TreeMap 是 Map 集合的另一种实现，它是基于红黑树的 Map 集合，具有排序功能，同时也允许 null 值
        // 3. LinkedHashMap： LinkedHashMap 是 Map 集合的另一种实现，它是基于哈希表和链表的 Map 集合，具有保持插入顺序的功能，同时也允许 null 值

        // 8.3 Map 集合的声明和初始化
        // Map<String, Integer> map = new HashMap<String, Integer>();
        // 声明一个 HashMap 集合，键是 String 类型，值是 Integer 类型
        HashMap<String, Integer> personAgeMap = new HashMap<String, Integer>();
        // 元素添加到 Map 集合
        personAgeMap.put("Tom", 27);
        personAgeMap.put("Jerry", 30);
        personAgeMap.put("Mike", 22);
        personAgeMap.put("Lucy", 40);

        // 8.4 Map 集合的遍历
        // 遍历 Map 集合的键值对
        for (Map.Entry<String, Integer> entry : personAgeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        // 遍历 Map 集合的键
        for (String key : personAgeMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        // 遍历 Map 集合的值
        for (Integer value : personAgeMap.values()) {
            System.out.println(value);
        }
        System.out.println();

        // 8.5 Map 集合的常用方法
        // 1. size()：返回 Map 集合中元素的数量
        System.out.println("Map 集合中元素的数量：" + personAgeMap.size());

        // 2. isEmpty()：判断 Map 集合是否为空
        System.out.println("Map 集合是否为空：" + personAgeMap.isEmpty());

        // 3. containsKey(Object key)：判断 Map 集合中是否包含指定的键
        System.out.println("Map 集合中是否包含键 Tom：" + personAgeMap.containsKey("Tom"));

        // 4. containsValue(Object value)：判断 Map 集合中是否包含指定的值
        System.out.println("Map 集合中是否包含值 27：" + personAgeMap.containsValue(27));

        // 5. get(Object key)：获取 Map 集合中指定键对应的值
        System.out.println("获取 Map 集合中键 Tom 对应的值：" + personAgeMap.get("Tom"));

        // 6. put(K key, V value)：向 Map 集合中添加元素
        personAgeMap.put("Jack", 25);
        System.out.println("添加元素后 Map 集合：" + personAgeMap);

        // 7. remove(Object key)：从 Map 集合中删除指定键的元素
        personAgeMap.remove("Jack");
        System.out.println("删除元素后 Map 集合：" + personAgeMap);

        // 8. clear()：清空 Map 集合
        personAgeMap.clear();
        System.out.println("清空 Map 集合后：" + personAgeMap);
    }
}