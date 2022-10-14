package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = 999;
        int minI = 0, minJ = 0;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.println(minI + " " + minJ);
    }
}

/*
Минимальный элемент
Сначала вводятся два натуральных числа n и m - количество строки и столбцов в двумерном массиве.
Затем вводится сами элементы массива. Определите индексы минимального элемента этого двумерного массива.
Гарантируется, что такой элемент единственный. Выведите в качестве ответа два целых числа через пробел.

Sample Input 1:
5 7
2 54 32 1 67 4 32
4 45 13 56 1 6 32
134 1 341 34 13 15 15
2 4 1 3 5 -2 6
3 4 14 134 1 35 4
Sample Output 1:
3 5

Sample Input 2:
3 4
3 5 6 7
8 9 39 2
1 9 3 2
Sample Output 2:
2 0
 */