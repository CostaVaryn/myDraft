package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrNumsAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int[] arr = new int[x + 1];
        int c = 0;
        if (x > 1) {
            for (int i = 2; i <= x; i += 2) {
                arr[i] = (i);
                c = c + arr[i];
                System.out.print(i != arr.length - 1 ? arr[i] + " " : arr[i]);
            }
            System.out.print("\n" + c);
        }
    }
}

/*
 * На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно).
 * Выведите на печать массив в одной строке, через пробел.
 * Посчитайте и выведите на печать сумму элементов массива.
 *
 * Sample Input:
 * 10
 * Sample Output:
 * 2 4 6 8 10
 * 30
 */
