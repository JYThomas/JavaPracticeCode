// Part 7: 列表示例

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // 7. 列表：一种动态的集合，可以存储不同类型的数据，创建可调整大小的数组
        // 使用场景：需要存储大量的数据，并且需要对数据进行增删改查操作
        
        // 列表的声明和初始化
        // 初始化一个空的列表
        List list = new ArrayList();
        
        // 输出空列表
        System.out.println(list);
        
        // 向列表中添加元素
        list.add("Tom");
        list.add(100);
        list.add(true);
        list.add(3.14);
        
        // 输出列表
        System.out.println(list);
        
        // 列表的遍历
        for (int i = 0; i < list.size(); i++) {
            // 输出列表索引 + 列表元素
            System.out.println("索引：" + i + " 元素：" + list.get(i));
        }
        System.out.println();

        // list和ArrayList的区别
        // 相同点：都是动态的集合，可以存储不同类型的数据，创建可调整大小的数组
        // 不同点：list是接口，ArrayList是类，list可以存储不同类型的元素，ArrayList只能存储一种类型的数据
        // 适用场景：list适合存储不同类型的数据，ArrayList适合存储相同类型的数据

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Tom");
        stringList.add("Jerry");
        stringList.add("Mike");
        stringList.add("Lucy");

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        // 输出ArrayList
        System.out.println(stringList);  
        // 输出List
        System.out.println(intList);  

        
    }
}

// 输出结果：
// []
// [Tom, 100, true, 3.14]
// 索引：0 元素：Tom
// 索引：1 元素：100
// 索引：2 元素：true
// 索引：3 元素：3.14

// [Tom, Jerry, Mike, Lucy]
// [1, 2, 3, 4]    
