package stepik.javabasics.languagebasics.problemsolving;

import java.util.Scanner;

public class RowAndColumn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];
        boolean is_15_Row = false;
        boolean is_15_Column = false;
        int multy = 1;
        int val = 15;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multy *= arr[i][j];
                if ((multy == val) && (j == m - 1)) {
                    is_15_Row = true;
                }
            }
            multy = 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                multy *= arr[j][i];
                if ((multy == val) && (j == n - 1)) {
                    is_15_Column = true;
                }
            }
            multy = 1;
        }
        System.out.println(is_15_Row ? "YES" : "NO");
        System.out.println(is_15_Column ? "YES" : "NO");
    }
}

/*
Вводятся 2 натуральных числа: n и m.
Затем вводится двумерный массив размером n*m.
Определите, есть в ней строка и столбец, произведение элементов которой равно 15.
Выведите на экран два ответа "YES/NO" построчно.

Sample Input:
3 4
1 1 3 5
4 6 7 8
-5 6 3 4

Sample Output:
YES
NO
 */