package stepik.javacore.mainmodule;

import java.util.Scanner;

public class ArrSimpleNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, num;
        sc.close();
        for (int i = 1; i <= 1000000; i++) {
            if (i > 3 && ((i % 2 == 0) || (i % 3 == 0)) || i == 1) {
                continue;
            } else {
                num = i;
                count++;
            }
            if (count == n) {
                System.out.println(num);
                break;
            }
        }
    }
}
