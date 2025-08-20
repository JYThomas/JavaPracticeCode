// Part 12: 数据类型转换

import java.util.Scanner;

public class DataTypeConvert {
    public static void main(String[] args) {
        // 12. 数据类型转换：Java 程序在运行时，需要将一种数据类型转换为另一种数据类型
        // 12.1 自动类型转换：Java 编译器会自动将小范围的数据类型转换为大范围的数据类型
        // 12.2 强制类型转换：使用强制类型转换可以将一种数据类型转换为另一种数据类型
        // 12.3 基本数据类型之间的转换：
        // 1. 整数类型之间的转换：byte、short、int、long
        // 2. 浮点类型之间的转换：float、double
        // 3. 字符类型之间的转换：char
        // 4. 布尔类型之间的转换：boolean
        // 12.4 字符串类型之间的转换：
        // 1. 字符串到基本数据类型：使用 parseXXX() 方法，如 parseInt()、parseDouble()、parseBoolean()
        // 2. 基本数据类型到字符串：使用 toString() 方法，如 int 类型转换为 String 类型时，使用 Integer.toString() 方法
        // 3. 字符串到其他类型：使用其他类型的 parseXXX() 方法，如 parseDouble()、parseBoolean()
        // 4. 其他类型到字符串：使用 toString() 方法，如 double 类型转换为 String 类型时，使用 Double.toString() 方法

        // 1. 整数类型之间的转换
        // 1.1 byte 到 short、int、long
        byte b = 10;
        short s = (short) b;
        int i = (int) b;
        long l = (long) b;
        System.out.println(s + " " + i + " " + l); // 10 10 10

        // 1.2 short 到 int、long
        short s2 = 20;
        int i2 = (int) s2;
        long l2 = (long) s2;
        System.out.println(i2 + " " + l2); // 20 20

        // 1.3 int 到 long
        int i3 = 30;
        long l3 = (long) i3;
        System.out.println(l3); // 30

        // 2. 浮点类型之间的转换
        // 2.1 float 到 double
        float f = 1.5f;
        double d = (double) f;
        System.out.println(d); // 1.5

        // 3. 字符类型之间的转换
        // 3.1 char 到 int
        char c = 'a';
        int i4 = (int) c;
        System.out.println(i4); // 97

        // 12.5 字符串类型之间的转换
        // 1. 字符串到基本数据类型
        String str = "123";
        int i6 = Integer.parseInt(str);
        System.out.println(i6); // 123

        // 2. 基本数据类型到字符串
        int i7 = 456;
        String str2 = Integer.toString(i7);
        System.out.println(str2); // 456

        // 3. 字符串到其他类型
        String str3 = "1.23";
        double d2 = Double.parseDouble(str3);
        System.out.println(d2); // 1.23

        // 4. 其他类型到字符串
        double d3 = 3.1415926;
        String str4 = Double.toString(d3);
        System.out.println(str4); // 3.1415926
    }
}