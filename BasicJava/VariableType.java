// Part 3: 变量类型

public class VariableType {
    // 1. 类变量（静态变量）：属于类，所有对象共享，用static修饰
    public static int count = 0;

    // 2. 实例变量：属于对象，每个对象有一份，用非static修饰
    // 成员变量（类中定义的变量）：会有默认值（如 int 默认 0，boolean 默认 false 等）
    String name;
    int age;
    double height;
    boolean isMarried;

    // 3. 构造方法：用于创建对象，给实例变量初始化
    public VariableType(String name, int age, double height, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isMarried = isMarried;
        count++;
    }

    // 4. 实例方法：用于操作实例变量，与其他实例方法共同组成一个对象
    public void printInfo() {
        // 局部变量（方法/类的方法中定义的变量）：没有默认值，必须显式赋值后才能使用
        String message = "信息：局部变量，仅在方法内有效";
        // String message;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Married: " + isMarried);
        System.out.println("局部变量："+message);
    }

    public static void main(String[] args) {
        // 创建对象并实例化
        VariableType person1 = new VariableType("John", 25, 1.75, true);
        VariableType person2 = new VariableType("Mary", 30, 1.65, false);

        // 调用实例方法
        person1.printInfo();
        person2.printInfo();

        // 访问类变量
        System.out.println("Total count: " + count);

        // 访问局部变量
        // 实例访问局部变量或者直接访问局部变量 会报错：VariableType.java:44: error: cannot find symbol
        // System.out.println("局部变量："+person1.message);
        // System.out.println("局部变量："+message);
    }
}    
  