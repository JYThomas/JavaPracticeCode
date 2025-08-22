// Part6:Super关键字的使用

class Animal {
    public void sayType() {
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    public void sayType() {
        // 子类确实要重写父类的方法，但是可以通过super关键字调用父类的同名方法
        System.out.println("===========");
        super.sayType();
        System.out.println("I am a Dog");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayType();

        Dog dog = new Dog();
        dog.sayType();
        dog.bark();
    }
}