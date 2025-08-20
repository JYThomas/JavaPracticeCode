import java.util.Scanner;

// Part 4: 输入输出

public class InputAndOutput {
    public static void main(String[] args) {
        // Scanner 类用于输入输出 System.in 输入流
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        try {
            /*
             2. 输入输出：Scanner 类用于输入输出
             scanner.nextInt() 用于输入整数
             scanner.nextDouble() 用于输入浮点数
             scanner.nextLine() 用于输入字符串
             scanner.close() 用于关闭输入流
            */
            int age = scanner.nextInt();
            System.out.println("您的年龄是：" + age);
        } catch (Exception e) {
            System.out.println("输入错误，请输入数字");
        } finally {
            scanner.close();
        }
    }
}
