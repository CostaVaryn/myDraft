package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class Rotate90Left {
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
                mas2[m - j - 1][i] = mas[i][j];
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
Вводятся 2 натуральных числа:  n и m. Затем вводится двумерный массив размером n*m.
Поверните его на 90 градусов против часовой стрелке и выведите на экран (через пробел).

Sample Input:
3
4
1 2 3 8
4 6 7 8
-5 6 3 4
Sample Output:
8 8 4
3 7 3
2 6 6
1 4 -5
 */