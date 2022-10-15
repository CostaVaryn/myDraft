package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class Rotate4x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[][] mas2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas2[j][i] = mas[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Вводится натуральное число n. Затем вводится двумерный массив размером n*n.
Отобразите его относительно главной диагонали (из левого верхнего угла до правого нижнего)
и выведите на экран (через пробел).

Sample Input:
4
1 2 3 8
4 6 7 8
2 6 3 4
5 9 3 0
Sample Output:
1 4 2 5
2 6 6 9
3 7 3 3
8 8 4 0
 */