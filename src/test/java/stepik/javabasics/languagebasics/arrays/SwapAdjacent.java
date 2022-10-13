package stepik.javabasics.languagebasics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        if (n > 1) {
            for (int i = 0; i < n - 1; i += 2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        /*
        for (int i = 0; i < (n % 2 == 0 ? n : n - 1); i += 2) {
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println(y + "\n" + x);
        }
        if (n % 2 != 0) {
            System.out.print(sc.nextInt());
        }
        */

    }
}

/*
Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.).
Если элементов нечетное число, то последний элемент остается на своем месте.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input:
6
4
5
3
4
2
3
Sample Output:
5
4
4
3
3
2
 */