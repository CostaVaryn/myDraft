package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForSimpleRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/**
 * На вход подаётся два натуральных числа x и y.
 * Выведите на печать прямоугольник из звёздочек размером x*y.
 *
 * Sample Input:
 * 4 2
 * Sample Output:
 * **
 * **
 * **
 * **
 */
