// Part3:继承与多态

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 方法重写，重新定义父类的方法, 实现多态
    // 方法和父类方法名称相同，返回值类型也相同，参数列表也相同，但实现不同
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    // 方法重载 overload 方法相同，参数不同
    // 方法和父类方法名称相同，返回值类型也相同，但参数列表不同，实现不同
    public void sleep(int hour) {
        System.out.println(this.getName() + " is sleeping for " + hour + " hours");
    }

    public void meow() {
        System.out.println("Cat is meowing");
    }
}

public class InheritDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        // dog类继承了Animal类，所以可以调用Animal类的eat方法
        dog.eat();
        // dog类自己定义了bark方法，所以可以调用自己的bark方法
        dog.bark();

        Cat cat = new Cat();
        cat.setName("Kitty");
        // cat类继承了Animal类，所以可以调用Animal类的eat方法
        cat.eat();
        // cat类自己定义了meow方法，所以可以调用自己的meow方法
        cat.meow();
    }
}