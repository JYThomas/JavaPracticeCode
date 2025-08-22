// Part1:面向对象编程（Object-Oriented Programming，OOP）

public class ClassAndObject {
    public static void main(String[] args) {
        // 1. 类（Class）：
        // 1.1 类是对一类事物的抽象，它定义了该事物的属性和行为。
        // 1.2 类可以创建对象，对象是类的实例。
        // 1.3 类可以包含属性（成员变量）和方法（成员函数），属性和方法可以用来描述类的特征和行为。
        // 1.4 类可以继承其他类，也可以实现多个接口。

        // 2. 对象（Object）：
        // 2.1 对象是类的实例，它是类的一个具体的实现。
        // 2.2 对象包含了类的属性和方法，可以访问和修改这些属性和方法。
        // 2.3 对象可以被创建、使用、销毁。

        // 使用场景：
        // 1. 封装：将数据和操作数据的方法封装在一个类中，对外提供一个接口，隐藏内部的复杂逻辑。
        // 2. 继承：通过继承，可以创建新的类，从而扩展已有的类的功能。
        // 3. 多态：通过多态，可以调用父类的方法，并在运行时调用子类的实现。
        // 4. 组合：通过组合，可以将多个对象组合成一个更大的对象。

        
        class Person {
            // 成员变量
            private String name;
            private int age;

            // 构造方法
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // 成员方法/方法，注意：方法必须定义在类内部，不能定义在类外面。
            // 定义一个方法
            // 1. 方法的定义格式：
            //    访问权限 返回类型 方法名(参数列表) {
            //        方法体
            //    }
            // modifier static returnType nameOfMethod (parameters) {
            //        method body
            // }
            //static - 如果使用static关键字，则无需创建对象即可对其进行访问。
            // 例如，sqrt()标准Math类的方法是静态的。因此，我们可以直接调用Math.sqrt()而无需创建Math类的实例。
            public void sayHello() {
                System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
            }
        }

        // 创建对象,构造方法初始化对象属性
        // person是引用变量（存储在栈中），指向堆中创建的Person对象
        // 引用本身不存储对象数据，只存储对象的地址。
        // 引用是指向对象的 "指针"，存储对象在内存中的地址。
        Person person = new Person("Tom", 20);

        // 调用方法
        person.sayHello();
    }
}