// Part 10: 异常处理

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HandleException {
    public static void main(String[] args) {
        // 10. 异常处理：Java 程序在运行时，可能会出现各种异常，如语法错误、运行时错误、输入输出错误等
        // 10.1 异常的种类：
        // 1. 语法错误：程序编写时出现的错误，如缺少分号、括号、引号等
        // 2. 运行时错误：程序运行时出现的错误，如数组越界、空指针、类型转换错误等
        // 3. 输入输出错误：程序读写文件时出现的错误，如文件不存在、读写失败等
        // 10.2 异常处理的目的：
        // 1. 避免程序崩溃
        // 2. 提高程序的可靠性
        // 3. 使程序更加健壮

        // 10.3 异常处理的原则：
        // 1. 捕获异常：使用 try-catch 语句捕获异常，并处理异常
        // 2. 抛出异常：使用 throw 语句抛出异常，并通知调用者
        // 3. 抛出异常的类：应该根据异常的类型，选择合适的异常类
        // 4. 不要忽略异常：如果不处理异常，程序将终止运行

        // 10.4 异常处理的语法格式：
        // try {
        //     // 可能产生异常的代码
        // } catch (异常类 变量名) {
        //     // 处理异常的代码
        // } finally {
        //     // 最终执行的代码，不管是否出现异常
        // }

        // 10.5 异常处理的示例：
        // 除以 0 异常
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("除以 0 异常：" + e.getMessage());
        } finally {
            System.out.println("程序结束");
        }       
    }
}
