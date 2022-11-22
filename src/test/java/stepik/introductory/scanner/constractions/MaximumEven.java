package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class MaximumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int w = (a + b + c) - min - max;
        sc.close();
        if (max % 2 == 0) {
            System.out.println(max);
        } else if (w % 2 == 0) {
            System.out.println(w);
        } else if (min % 2 == 0) {
            System.out.println(min);
        } else {
            System.out.println("Чётных чисел нет");
        }
    }
}

/*
 * На вход подаётся три целых числа. Выведите максимальное чётное из них.
 * Если чётных чисел нет, выведите "Чётных чисел нет".
 *
 * Sample Input:
 * 5 10 15
 * Sample Output:
 * 10
 */