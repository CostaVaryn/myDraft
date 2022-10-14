package stepik.javabasics.languagebasics.twodimensionalarrays;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        int m = 0;
        int sumMax = Integer.MIN_VALUE;
        int sumN = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            m = sc.nextInt();
            arr[i] = new int[m];
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                sumN += arr[i][j];
            }
                if (sumMax < sumN) {
                    sumMax = sumN;
                    index = i;
                }
            sumN = 0;
        }
        sc.close();
        System.out.println(index + 1);
        System.out.println(sumMax);
        for (int item : arr[index]) {
            System.out.print(item);
            System.out.print(" ");
        }
    }
}

/*
Дан зубчатый двумерный массив.
Необходимо определить номер строки с максимальной суммой, максимальную сумму и саму строку, которая даёт эту сумму.

Входные данные:
Вводится число n - количество строк зубчатого массива.
Затем информация вводится следующими блоками: число k - количество элементов в строке и потом k элементов.

Выходные данные:
Выведите на экран номер строки с максимальной суммой и сумму на разных строках.
На следующей строчке выведите саму строку, которая даёт эту сумму.

Sample Input:
4
3
1 8 9
5
1 -2 3 6 4
6
1 1 1 1 1 1
3
-1 2 5
Sample Output:
1
18
1 8 9
 */