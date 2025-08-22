// (Main类)：

// Main类隶属于com.example包
package com.example;

// 从根目录4.PackageManagement下开始，导入Circle和Rectangle类
import com.example.shapes.Circle;
import com.example.shapes.Rectangle;

public class Main { 
    public static void main(String[] args) {
        // 调用Rectangle类
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle: Length = " + rect.getLength() + ", Width = " + rect.getWidth() + ", Area = " + rect.getArea() + ", Perimeter = " + rect.getPerimeter());

        // 调用Circle类
        Circle circle = new Circle(4);
        System.out.println("Circle: Radius = " + circle.getRadius() + ", Area = " + circle.getArea() + ", Circumference = " + circle.getCircumference());
    
        // 调用Circle类中的PI常量,通过类名访问静态变量
        System.out.println("Circle: PI = " + Circle.PI);
    }   
}