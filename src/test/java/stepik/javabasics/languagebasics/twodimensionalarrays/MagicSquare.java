package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class MagicSquare {
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


    }
}

/*
Входные данные
Программа получает на вход число n < 11, являющееся числом строк и столбцов в массиве.
Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.

Выходные данные
Программа должна выводить слово YES для магического квадрата и слово NO для не магического.

Sample Input 1:
3
2 7 6
9 5 1
4 3 8
Sample Output 1:
YES

Sample Input 2:
4
1 2 3 4
5 6 7 8
9 3 4 5
3 2 1 5
Sample Output 2:
NO
 */