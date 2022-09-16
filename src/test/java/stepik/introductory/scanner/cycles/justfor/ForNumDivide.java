package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForNumDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = 1;
        for (int i = 1; i<=a; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                b = i;
                System.out.print(b + " ");
            }
        }
        if (b == 1) {
            System.out.println("Таких чисел нет");
        }
        sc.close();
    }
}

/**
 * На вход подаётся натуральное число n.
 * Выведите на печать в одной строке через пробел все числа от 1 до n включительно,
 * которые одновременно без остатка делятся на 2 и на 3.
 * Если таких чисел в диапазоне нет, выведите "Таких чисел нет".
 *
 * Sample Input 1:
 * 1
 * Sample Output 1:
 * Таких чисел нет
 * Sample Input 2:
 * 20
 * Sample Output 2:
 * 6 12 18
 */