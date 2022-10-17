package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class HammerThrowing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxResult = Integer.MIN_VALUE;
        int count = 0;
        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = sc.nextInt();
                if (mas[i][j] > maxResult) {
                    maxResult = mas[i][j];
                }
            }
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maxResult == mas[i][j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        for  (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if (maxResult == mas[i][j]) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}

/*
В метании молота состязается n спортcменов. Каждый из них сделал m бросков.
Победитель определяется по лучшему результату.
Определите количество участников, а так же самих участников состязаний,
которые разделили первое место, то есть определите количество строк в массиве,
которые содержат значение, равное наибольшему.

Входные данные
Программа получает на вход два числа n и m,  являющиеся числом строк и столбцов в массиве.
Далее во входном потоке идет n  строк по m чисел, являющихся элементами массива.

Выходные данные
Сначала программа выводит количество спортсменов, показавших наилучший результат,
затем – их номера в порядке возрастания. Не забудьте, что  строки (спортсмены) нумеруются с 0.

Sample Input 1:
3 3
3 1 2
1 3 4
3 3 3
Sample Output 1:
1
1

Sample Input 2:
3 5
3 1 2 4 2
1 3 4 1 3
3 3 3 3 3
Sample Output 2:
2
0 1
 */