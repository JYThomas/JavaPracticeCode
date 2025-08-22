// Part 11: 文件输入输出  

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        // 11. 文件输入输出：Java 程序可以读写文件，Java 提供了 File 类来操作文件
        // 11.1 File 类的特点：
        // 1. 路径名：File 类可以表示文件或目录的路径名
        // 2. 路径名的语法：
        // 2.1 Windows 路径名：C:\Users\Tom\Desktop\JavaPracticeCode\BasicJava\FileIO.java
        // 2.2 Unix 路径名：/home/Tom/Desktop/JavaPracticeCode/BasicJava/FileIO.java
        // 3. 文件名：File 类可以表示文件名
        // 4. 文件名的语法：只能包含字母、数字、下划线、点号，且不能以点号开头

        // 判断是否有文件存在
        File file = new File("IO.txt");
        if (file.exists()) {
            System.out.println("文件存在");
        } else {
            // 生成txt文件
            try {
                file.createNewFile();
                System.out.println("文件已生成");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 写入内容到txt文件
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        } 

        // 读取刚刚生成的txt文件内容   
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
