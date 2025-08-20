import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

// Part 6: 数组示例

public class ArrayDemo {
    public static void main(String[] args) {        
        // 6. 数组：一组相同类型的数据的集合，用[]表示，可以存储不同类型的数据
        // 数组的声明和初始化
        // 初始化一个长度为5的整数数组
        int[] numbers = new int[5];
        // 数组的赋值
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // 常用的数组初始化方法
        int[] initnumbers2 = {1, 2, 3, 4, 5};
        String[] initnames = {"Tom", "Jerry", "Mike", "Lucy"};

        // 数组的遍历
        for (int i = 0; i < numbers.length; i++) {
            // 输出数组索引 + 数组元素
            System.out.println("索引：" + i + " 元素：" + numbers[i]);
        }
        System.out.println();
        

        // 输出数组的长度
        System.out.println("数组的长度：" + numbers.length);

        // 数组的遍历（增强版） 迭代输出数组元素
        // 原理：使用for-each循环遍历数组 每次循环获取数组中的一个元素 并将其赋值给变量 
        // 变量的类型必须与数组元素的类型一致
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();


        // 数组的复制
        // 数组的浅拷贝：通过赋值来实现
        // 数组的浅拷贝：将一个数组赋值给另一个数组，两个数组指向同一块内存空间
        int[] numbers1 = numbers;
        numbers1[0] = 10;
        System.out.println("numbers1[0] = " + numbers1[0]);
        System.out.println("numbers[0] = " + numbers[0]);
        // 输出数组的内存地址
        System.out.println("numbers 内存地址：" + System.identityHashCode(numbers));
        System.out.println("浅拷贝numbers1 内存地址：" + System.identityHashCode(numbers1));
        System.out.println();

        

        // 数组的深拷贝：Arrays.copyOf() 方法
        // 数组的深拷贝：将一个数组复制到另一个数组中，避免修改原数组，在内存中开辟新的空间
        // 参数1：原数组，参数2：新数组的长度
        
        int[] DeepNumbers = Arrays.copyOf(numbers, numbers.length);
        DeepNumbers[0] = 10;
        System.out.println("DeepNumbers[0] = " + DeepNumbers[0]);
        System.out.println("numbers[0] = " + numbers[0]);
        // 输出数组的内存地址
        System.out.println("numbers 内存地址：" + System.identityHashCode(numbers));
        System.out.println("深拷贝DeepNumbers 内存地址：" + System.identityHashCode(DeepNumbers));
        System.out.println();



        // 二维数组
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // 二维数组的遍历
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        // 动态数组：ArrayList 类
        // 动态数组的声明和初始化
        // 注意：动态数组的长度不确定，需要使用ArrayList类
        // 优点：可以动态扩容，节省内存
        // 缺点：效率低，每次添加元素都需要扩容
        // 适用场景：需要频繁添加元素的场景
        ArrayList<String> DynamicNames = new ArrayList<String>();
        DynamicNames.add("Tom");
        DynamicNames.add("Jerry");
        DynamicNames.add("Mike");
        DynamicNames.add("Lucy");

        // 动态数组的遍历
        for (int i = 0; i < DynamicNames.size(); i++) {
            System.out.println(DynamicNames.get(i));
        }

        // 动态数组的添加元素
        DynamicNames.add("Jack");
        System.out.println("添加元素：Jack");

        // 动态数组的删除元素
        DynamicNames.remove(2); 
        System.out.println("删除元素：Mike");

        // 动态数组的修改元素
        DynamicNames.set(1, "Lily");
        System.out.println("修改元素：Lily");

        // 动态数组的长度
        System.out.println("数组的长度：" + DynamicNames.size());  
        System.out.println();


        // 数组排序
        // 数组排序：Arrays.sort() 方法
        // 数组排序：将数组中的元素进行排序，默认升序排序
        // 注意：排序后原数组会被修改
        int[] SortNumbers = {5, 3, 1, 4, 2};
        Arrays.sort(SortNumbers);
        for (int i = 0; i < SortNumbers.length; i++) {
            System.out.print(SortNumbers[i] + " ");
        }
        // 输出原数组
        System.out.println(SortNumbers);
        System.out.println();
        
    }
}