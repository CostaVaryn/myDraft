package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class MatrixSymmetrical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = 0;
        int right = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (i < j) {
                    left = left + arr[i][j];
                    continue;
                }
                if (j < i) {
                    right = right + arr[i][j];
                    continue;
                }
            }
        }
        if (left == right) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.

Входные данные
Программа получает на вход число n < 100, являющееся числом строк и столбцов в массиве.
Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.

Выходные данные
Программа должна выводить слово YES для симметричного массива и слово NO для несимметричного.

Sample Input 1:
3
0 1 2
1 5 3
2 3 4
Sample Output 1:
YES
Sample Input 2:
3
0 0 0
0 0 0
1 0 0
Sample Output 2:
NO
 */