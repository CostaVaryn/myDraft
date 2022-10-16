package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class NeighborsOfTheSameSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; i++) {
            if (i - 1 >= 0) {
                if (((arr[i] < 0) && (arr[i - 1] < 0)) || ((arr[i] > 0) && (arr[i - 1] > 0))) {
                    x = 0;
                } else {
                    x++;
                }
            }
        }
        if (n == 0) {
            System.out.print("YES");
        } else {
            if (x == arr.length - 1) {
                System.out.print("NO");
            } else {
                System.out.print("YES");
            }
        }
    }
}

/*
Дан массив, состоящий из целых чисел.
Напишите программу, которая определяет, есть ли в массиве пара соседних элементов с одинаковыми знаками.

Входные данные
Сначала задано число N — количество элементов в массиве (2 ≤ N ≤ 10000).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести слово YES, если существует пара соседних элементов с одинаковыми знаками.
В противном случае следует вывести слово NO.

Sample Input:
5
1 -3 4 -2 1
Sample Output:
NO
 */