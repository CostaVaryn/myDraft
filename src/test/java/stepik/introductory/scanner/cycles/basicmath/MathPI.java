package stepik.introductory.scanner.cycles.basicmath;

import java.util.Scanner;

public class MathPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (0 < a && a <= 10) {
            double b = Math.PI;
            double c = Math.pow(10, a);
            System.out.println((Math.round(b * c) / c));
        } else if (0 == a) {
            System.out.println("3");
        }
    }
}

/*
 * Дано число 0 <= n <= 10. Выведите число pi (π) с точностью n знаков после запятой.
 * Воспользуйтесь константой PI из класса Math.
 *
 * Sample Input:
 * 3
 * Sample Output:
 * 3.142
 */
