// Part 12: 字符串操作

import java.util.Arrays;

public class StringOperation {
    public static void main(String[] args) {
        // 12. 字符串操作：Java 提供了 String 类来操作字符串
        // 12.1 String 类的特点：
        // 1. 字符串是不可变的：字符串一旦创建，内容就不能改变
        // 2. 字符串是字符序列：字符串是一系列字符的序列
        // 3. 字符串是对象：字符串是 Java 类，可以被实例化、操作

        // 12.2 字符串的创建：
        // 1. 字面量创建：直接在双引号中输入字符串
        String str1 = "Hello World!";
        // 2. 构造器创建：使用 String 类的构造器创建字符串
        String str2 = new String("Hello World!");
        // 3. 字符串拼接：使用 + 运算符拼接字符串
        String str3 = "Hello " + "World!";
        // 字符串按照逗号分裂
        String[] strArray = str3.split(",");
        System.out.println(Arrays.toString(strArray)); // [Hello World!]    

        // 数组组成的字符串
        String str4 = Arrays.toString(strArray);
        System.out.println(str4); // [Hello World!]

        // 字符串的长度
        int length = str1.length();
        System.out.println(length); // 12

        // 字符串的索引：从 0 开始
        char ch = str1.charAt(0);
        System.out.println(ch); // H

        // 字符串的比较：
        // 1. 字符串的比较是基于字符序列的
        // 2. 字符串的比较是大小写敏感的
        String str5 = "hello world";
        String str6 = "Hello World";
        System.out.println(str5.equals(str6)); // false
        System.out.println(str5.equalsIgnoreCase(str6)); // true

        // 12.3 字符串的截取：
        // 1. 截取子字符串：使用 substring 方法截取子字符串
        String str7 = "Hello World!";
        String subStr = str7.substring(6, 11);
        System.out.println(subStr); // World
    }
}
