package stepik.introductory.scanner.cycles;

import java.util.Scanner;

public class ForNumDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i<a; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                b = i;
                System.out.println(b + " ");
            }
        }
        if (b == 1) {
            System.out.println("Таких чисел нет");
        }
    }
}
