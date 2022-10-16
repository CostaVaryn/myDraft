package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class RemoveEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            if (mas[i] % 2 == 0)
                System.out.print(mas[i] + " ");
        }
    }
}

/*
Дан массив, состоящий из целых чисел.
Напишите программу, которая выводит те элементы массива, которые являются чётными числами.

Входные данные
Сначала задано число N — количество элементов в массиве (1 ≤ N ≤ 100). Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести все четные элементы массива (то есть те элементы, которые являются четными числами).

Sample Input:
6
1 3 5 -2 6 7
Sample Output:
-2 6
 */