package stepik.javacore.mainmodule;

import java.util.Scanner;

public class MinusNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int min = 0;

        int max = 1000000000;

        if ((min <= a && a <= max) && (min <= b && b <= max)) {
            System.out.println(a - b);
        }
    }
}
