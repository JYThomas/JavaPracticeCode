// Part 2: 基本数据类型

public class PrimitiveDataType{
    public static void main(String[] args){
        // 整数类型
        int IntNumber = 32767;                   // 32位，最常用的整数类型
        long LongNumber = 9223372036854775807L;  // 64位，结尾需要加L
        short ShortNumber = 32767;               // 16位，范围：-32768 到 32767

        // 浮点类型
        float FloatNumber = 3.1415925f;          // 32位单精度，结尾需要加f
        double DoubleNumber = 3.1415926535;      // 64位双精度，默认的浮点类型

        // 字符类型
        char CharType = 'A';    // 16位Unicode字符

        // 布尔类型
        boolean BoolTypeTure = true;
        boolean BoolTypeFalse = false;

        // 输出变量值
        System.out.println("整型："+IntNumber);
        System.out.println("长整型："+LongNumber);
        System.out.println("短整型："+ShortNumber);
        System.out.println("单精度浮点型："+FloatNumber);
        System.out.println("双精度浮点型："+DoubleNumber);
        System.out.println("字符型："+CharType);
        System.out.println("布尔型："+BoolTypeTure);
        System.out.println("布尔型："+BoolTypeFalse);

    }
}