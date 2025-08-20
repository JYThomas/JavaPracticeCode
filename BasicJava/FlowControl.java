// Part 5: 流程控制

public class FlowControl {    
    public static void main(String[] args) {
        // 5. 流程控制语句：if-else、switch-case、for、while

        // if-else语句
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        // if-else if-else语句
        int num = 10;
        if (num > 0) {
            System.out.println("num > 0");
        } else if (num < 0) {
            System.out.println("num < 0");
        } else {
            System.out.println("num = 0");
        }

        // switch-case语句
        switch (num) {
            case 10:
                System.out.println("num = 10");
                break;
            case 20:
                System.out.println("num = 20");
                break;
            default:
                System.out.println("num 不是 10 或者 20");
                break;
        }

        // for 循环
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // while 循环 先判断再执行
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        // do-while 循环 先执行再判断
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);   

        // continue 语句
        for (int l = 0; l < 5; l++) {
            if (l == 2) {
                // 当 l 等于 2 时，跳过本次循环 不输出 l = 2
                continue;
            }
            System.out.println("l = " + l);
        }

        // break 语句
        for (int m = 0; m < 5; m++) {
            if (m == 3) {
                // 当 m 等于 3 时，跳出循环 后续语句不再执行
                break;
            }
            System.out.println("m = " + m);
        }
    }
}   