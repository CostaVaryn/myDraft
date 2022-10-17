package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int counter = 0;

        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int j = 0; j < mas[0].length; j++) {
            counter += mas[0][j];
        }

        int op = 0;
        for (int i = 0; i < mas.length; i++) {
            op = 0;
            for (int j = 0; j < mas[i].length; j++) {
                op += mas[i][j];
            }
            if (op == counter) {
                count++;
            }
        }

        int ip = 0;
        for (int i = 0; i < mas.length; i++) {
            ip = 0;
            for (int j = 0; j < mas[i].length; j++) {
                ip += mas[j][i];
            }
            if (ip == counter) {
                count++;
            }
        }

        int sh = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j) {
                    sh += mas[j][i];
                }
            }
        }

        if (sh == counter) {
            count++;
        }

        int lp=0;
        int maxIdx = mas.length - 1;
        for (int i = maxIdx; i >= 0; i--) {
            lp += mas[i][maxIdx - i];
        } if (lp == counter) {
            count++;
        }

        if (count == n*2+2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
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