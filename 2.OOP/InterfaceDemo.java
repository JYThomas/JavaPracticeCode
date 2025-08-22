// Part5:接口（Interface）

// 接口是一种抽象类型，它定义了一组方法，但是不能实例化，只能被实现。
// 类只能有一个父类，但可以实现多个接口,表示 "附加能力" 而非类的核心属性（核心属性通常用类或抽象类表示）。
// 使用场景:

// 接口可以有属性和方法，但是不能有构造方法
// 接口中的方法默认是public abstract的，不能有方法体
// 实现了接口的类，必须实现接口中定义的所有方法，否则不能实例化

/*
    抽象类和接口的区别
    若需要定义 "必须做什么"（行为规范），用接口；
    若需要定义 "是什么 + 部分怎么做"（属性 + 部分实现），用抽象类。
*/

interface Sleeping {
    void sleep();
}

interface Eating {
    void eat();
}

abstract class Animal {
    // 抽象方法
    public abstract void move();
    
    // 普通方法
    public void speak() {
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal implements Sleeping, Eating {
    // 实现接口的方法
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }

    // 实现抽象类的方法
    public void move() {
        System.out.println("Dog is moving");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // 调用实现的接口方法
        dog.sleep();
        dog.eat();

        // 调用实现的抽象类方法
        dog.move();

        // 调用继承的抽象类的普通方法
        dog.speak();
    }    
}