// Part 13:  instanceof 运算符

public class InstanceofDemo {
    public static void main(String[] args) {
        // 13. instanceof 运算符：
        // 1. instanceof 运算符用来判断一个对象是否属于某个类或接口
        // 2. 语法格式：对象 instanceof 类或接口
        // 3. 作用：用来判断一个对象是否属于某个类或接口，如果是，则返回 true，否则返回 false

        String str = "Hello World!";
        if (str instanceof String) {
            System.out.println("str 是 String 类型");
        } else {
            System.out.println("str 不是 String 类型");
        }
    }
}