package stepik.practicejavabasic.block4;

import java.util.Scanner;

public class TransposedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arrInt = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrInt[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[][] arrInt1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrInt1[j][i] = arrInt[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(j != m - 1 ? arrInt1[i][j] + " " : arrInt1[i][j] + "");
            }
            System.out.println();
        }
    }
}

/*
Напишите программу, которая принимает в качестве параметра размеры двумерного целочисленного массива,
а затем и сам массив (матрицу) и возвращает его транспонированным.
В качестве разделителя в строке используйте пробел.

Результат транспонирования матрицы – это перевернутая по главной диагонали версия исходной матрицы.

Подсказка: Транспонированная матрица

Sample Input:
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output:
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16
 */