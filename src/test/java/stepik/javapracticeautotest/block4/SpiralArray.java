package stepik.javapracticeautotest.block4;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        for (int[] row : spiral(n, m)) {
            System.out.println(Arrays.toString(row)
                    .replaceAll("^\\[|]$", "")
                    .replace(",",""));
        }
    }

    public static int[][] spiral(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int num = 1;
        int max = rows * cols;
        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = cols - 1;
        while (num <= max) {
            // проход влево по верхней строке, инкремент столбцов
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            // проход вниз по правому краю, инкремент строк
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            // проход вправо по нижней строке, декремент столбцов
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            // проход вверх по левому краю, декремент строк
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }
        return arr;
    }
}

/*
Напишите программу, которая принимает на вход размер двумерного массива
и заполняет его целыми числами начиная с одного по спирали
(по часовой стрелке от верхнего левого угла по спирали).
В качестве разделителя при выводе строки используйте пробел.

Пример входных данных:
5 6
Вывод в консоль:
1 2 3 4 5 6
18 19 20 21 22 7
17 28 29 30 23 8
16 27 26 25 24 9
15 14 13 12 11 10

Sample Input:
5 5
Sample Output:
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
 */