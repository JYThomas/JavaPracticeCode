// Part4:抽象类与抽象方法

abstract class Animal {
    // 抽象类是一种特殊的类，它不能实例化，只能被继承，子类必须实现父类的抽象方法
    // 使用场景：
    // 1. 提取多个类的共性，实现代码复用,动物类（Animal）是抽象类，包含所有动物共有的属性（如name）和方法（如breathe()），而具体动物（Dog、Cat）只需实现自己特有的makeSound()方法
    // 2. 定义接口规范（部分实现 + 强制子类实现）,支付抽象类（Payment）定义了支付流程的固定步骤（processPayment()），但支付验证（validate()）和执行（execute()）由子类（如WechatPay、Alipay）实现
    // 3. 作为 "模板"，控制子类行为。报表生成抽象类（ReportGenerator）固定了报表生成的步骤（generate()），但数据获取（fetchData()）和格式化（format()）由子类实现

    // 抽象类不可实例化，只能被继承，子类必须实现父类的抽象方法
    // 抽象类可以有构造方法，可以有普通方法，可以有抽象方法
    // 抽象类不能有具体的属性和方法，只能有抽象属性和抽象方法
    // abstract只能修饰类和方法，不能修饰属性

    // 构造方法
    public Animal() {
        System.out.println("Animal is created");
    }
    
    // 抽象方法
    public abstract void eat();

    // 抽象类可以有普通属性和普通方法
    public String name;
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    
    // 静态方法
    public static void sayHello() {
        System.out.println("Hello, I am an Animal");
    }
}

class Dog extends Animal {
    // 子类必须实现父类的抽象方法
    public void eat() {
        System.out.println("Dog is eating");
    }
    // 子类没有定义属性的情况下，可以继承父类的抽象属性
    public String name = "Doggy";

    // 子类可以有自己的属性和方法
    public String dogtype = "Golden";
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // 抽象类不能实例化
        // Animal animal = new Animal(); // 报错

        Dog dog = new Dog();
        // 实现父类的抽象方法
        dog.eat();
        // 继承父类的方法
        dog.sleep();
        // 继承父类抽象属性
        System.out.println(dog.name);
        // 子类自己的属性
        System.out.println(dog.dogtype);
        // 子类自己的方法
        dog.bark();

        // 调用抽象类的静态方法：抽象类名.静态方法名()  
        Animal.sayHello(); 
    }
}   