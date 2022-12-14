package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class EvenIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 || i == 0)
                System.out.print(mas[i] + " ");
        }
    }
}

/*
Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0.
Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).

Входные данные
Сначала задано число N — количество элементов в массиве (1 ≤ N ≤ 100).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести все элементы массива с чётными номерами.

Sample Input:
6
1 3 5 2 4 7
Sample Output:
1 5 4
 */