package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class Rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[][] mas2 = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas2[j][n - i - 1] = mas[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Вводятся 2 натуральных числа: n и m. Затем вводится двумерный массив размером n*m.
Поверните его на 90 градусов по часовой стрелке и выведите на экран (через пробел).

Sample Input:
3
4
1 2 3 8
4 6 7 8
-5 6 3 4
Sample Output:
-5 4 1
6 6 2
3 7 3
4 8 8
 */