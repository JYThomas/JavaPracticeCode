// Part1:泛型

// 泛型: "参数化类型"，将类型由原来的具体类型参数化，在使用时再指定具体的类型。

// 使用场景(具体业务场景例子)：
/*
 * 在实际业务开发中，数据访问层（DAO 层） 是泛型最常用的具体场景之一。
 * 假设你正在开发一个电商系统，需要对不同实体（如用户、商品、订单）进行 CRUD（增删改查）操作。
 * 这些操作的逻辑几乎相同，只是处理的实体类型不同 —— 这正是泛型的绝佳应用场景。
 * 
 * 假设系统中有三个核心实体：User（用户）\ Product（商品）\ Order（订单）
 * 传统方式需要为每个实体编写一套 DAO 接口和实现，而使用泛型可以抽象出通用逻辑，大幅减少重复代码。
*/

// 泛型的语法：
// 1. 定义泛型类
// 2. 定义泛型方法
// 3. 定义泛型接口

// 1. 定义泛型类
// 定义一个泛型类，可以指定类型参数 T，表示该类可以处理不同类型的数据。
// 例如，定义一个泛型类 ArrayList<T>，表示该类可以处理不同类型的元素。

// 2. 定义泛型方法
// 定义一个泛型方法，可以指定类型参数 T，表示该方法可以处理不同类型的数据。
// 例如，定义一个泛型方法 add(T t)，表示该方法可以添加不同类型的元素。

// 3. 定义泛型接口
// 定义一个泛型接口，可以指定类型参数 T，表示该接口可以处理不同类型的数据。
// 例如，定义一个泛型接口 Comparable<T>，表示该接口可以对不同类型的元素进行比较。

// 泛型的使用

// 1. 泛型类：一个可以存放任何类型的盒子
class Box<T> {
    // 用泛型类型T定义变量
    private T item;
    
    // 存放物品
    public void put(T item) {
        this.item = item;
    }
    
    // 取出物品（自动返回正确类型，无需强转）
    public T get() {
        return item;
    }
}

// 2. 测试类 
public class GenericsDemo {
    public static void main(String[] args) {
        // 尖括号中自定义要传入的数据类型，对应的数据类型要执行的操作，都有共性
        // 场景1：创建一个存放字符串的盒子
        Box<String> stringBox = new Box<>();
        stringBox.put("苹果");
        // 直接获取字符串类型，无需强转
        String fruit = stringBox.get();
        System.out.println("从字符串盒子取出：" + fruit);
        
        // 场景2：创建一个存放整数的盒子
        Box<Integer> numberBox = new Box<>();
        numberBox.put(100);
        // 直接获取整数类型
        int number = numberBox.get();
        System.out.println("从数字盒子取出：" + number);
        
        // 场景3：创建一个存放自定义对象的盒子
        Box<Person> personBox = new Box<>();
        personBox.put(new Person("小明", 18));
        // 直接获取Person类型
        Person person = personBox.get();
        System.out.println("从人物盒子取出：" + person.getName());
    }
}

// 辅助类：自定义Person类
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
}
