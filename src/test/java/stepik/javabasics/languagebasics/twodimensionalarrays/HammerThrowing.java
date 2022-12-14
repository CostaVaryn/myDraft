package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class HammerThrowing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxResult = Integer.MIN_VALUE;
        int numHuman = 0;
        int numAttempt = 0;

        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = sc.nextInt();
                if (mas[i][j] > maxResult) {
                    maxResult = mas[i][j];
                    numHuman = i;
                    numAttempt = j;
                }
            }
        }
        sc.close();
        System.out.println(maxResult);
        System.out.print(numHuman + " " + numAttempt);
    }
}

/*
В метании молота состязается n спортcменов. Каждый из них сделал m бросков.
Победителем соревнований объявляется тот спортсмен, у которого максимален наилучший результат по всем броскам.
Таким образом, программа должна найти значение максимального элемента в данном массиве,
а также его индексы (то есть номер спортсмена и номер попытки).

Входные данные
Программа получает на вход два числа n и m, являющиеся числом строк и столбцов в массиве.
Далее во входном потоке идет n строк по m чисел, являющихся элементами массива.

Выходные данные
Программа выводит значение максимального элемента, затем номер строки и номер столбца, в котором он встречается.
Если в массиве несколько максимальных элементов, то нужно вывести минимальный номер строки,
в которой встречается такой элемент, а если в этой строке таких элементов несколько,
то нужно вывести минимальный номер столбца. Не забудьте, что все строки и столбцы нумеруются с 0.

Sample Input:
3 3
3 1 2
1 3 4
3 3 3
Sample Output:
4
1 2
 */