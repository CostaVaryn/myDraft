package stepik.introductory.scanner.cycles.basicmath;

import java.util.Scanner;

public class MathSinCos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double y = Math.sin(Math.toRadians(a)) + Math.cos(Math.toRadians(a));
        System.out.println(y);
    }
}

/**
 * Дан угол A градусов. Выведите  y = sin(A) + cos(A).
 *
 * Sample Input:
 * 90
 * Sample Output:
 * 1.0
 */
