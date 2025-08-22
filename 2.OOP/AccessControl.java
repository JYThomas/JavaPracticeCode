// Part2:访问控制修饰符

class Person {
    // 私有成员变量
    private String name;
    private int age;

    public Person() {
        // 构造方法
        // 每个类都有它的构造函数，当类的对象被创建时，该构造函数将被自动调用。

        // 使用场景：
        // 1. 初始化对象属性
        // 2. 传递参数给构造方法
        // 3. 调用其他方法，初始化对象状态
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        // this关键字：
        // 1. this 关键字用来指代当前对象的引用。谁点调用，this 就代表谁。
        // 2. 它可以用来访问当前对象的成员变量和方法。
        // 3. 它可以用来调用当前对象的其他方法。
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // 私有方法,只能在当前类中访问
    // 使用场景：
    // 类中有一些方法，只想让内部使用，其他类不能访问，这时就可以将这些方法设置为私有方法。
    private void sayGoodmorning() {  
        System.out.println("Goodmorning, my name is " + name);
    }

    // 公共方法访问私有方法，接口外露
    public void SpeakGoodmorning() {
        sayGoodmorning();
    }

    // 公共方法
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // 受保护方法
    // 使用场景：
    // 类中有一些方法，只想让子类使用，其他类不能访问，这时就可以将这些方法设置为受保护方法。
    protected void sayGoodbye() {
        System.out.println("Goodbye, my name is " + name + " and I am " + age + " years old.");
    }
}

public class AccessControl {
    public static void main(String[] args) {
        // 访问控制修饰符：
        // 1. public：公共访问权限，可以被所有类访问。比如说
        // 2. private：私有访问权限，只能被当前类访问。
        // 3. protected：受保护访问权限，只能被同一个包内的类访问，例如：子类可以访问父类的受保护成员。
        // 4. 默认（package-private）：包访问权限，只能被同一个包内的类访问。

        // 使用场景 
        // 1. 封装：将数据和操作数据的方法封装在一个类中，对外提供一个接口，隐藏内部的复杂逻辑。
        // 2. 继承：通过继承，可以创建新的类，从而扩展已有的类的功能。
        // 3. 多态：通过多态，可以调用父类的方法，并在运行时调用子类的实现。
        // 4. 组合：通过组合，可以将多个对象组合成一个更大的对象。

        // 创建对象,构造方法初始化对象属性
        Person person = new Person();
        person.setName("Tom");
        person.setAge(20);

        // 访问公共成员变量
        System.out.println(person.getName());
        System.out.println(person.getAge());

        // 访问私有成员变量
        // person.name = "Jerry"; // 报错，不能直接访问私有成员变量

        // 访问公共方法
        person.sayHello();

        // 访问私有方法
        // person.sayGoodmorning(); // 报错，不能直接访问私有方法
        person.SpeakGoodmorning(); // 通过公共方法访问私有方法

        // 访问受保护方法
        // person.sayGoodbye(); // 报错，不能直接访问受保护方法，只能通过子类访问
    }
}