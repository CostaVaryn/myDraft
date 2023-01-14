package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3
        int m = sc.nextInt(); // 4
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                mas[i][j - 1] = j * i + j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(j == (m - 1) ? mas[i][j] : mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения размером n*m через пробел.

Sample Input:
3
4
Sample Output:
1 2 3 4
2 4 6 8
3 6 9 12
 */