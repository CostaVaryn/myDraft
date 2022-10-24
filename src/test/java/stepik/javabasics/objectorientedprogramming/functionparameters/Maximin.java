package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Scanner;

public class Maximin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        maximin(mas);
    }
    static void maximin(int[][] mas) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < mas.length; j++) {
            if (mas[0][j] < min) {
                min = mas[0][j];
            }
        }
        max = min;
        for (int i = 1; i < mas.length; i++) {
            min = mas[i][0];
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }
            }
            if (max < min) {
                max = min;
            }
        }
        System.out.println(max);
    }
}

/*
На вход вашей функции maximin даётся зубчатый двумерный массив (сначала даётся число n - количество строк,
а потом сами строки). Найдите максимальное значение среди минимальных элементов каждой строки.
Содержание функции main менять запрещено.

Как бонус вы можете посмотреть на код считывания неизвестного количества чисел в строке.

Sample Input:
4
1 2 4 3 5
3 2 4 4
6 5 3 4 6 7 5
1 2 1 2 1 2 2 1 1
Sample Output:
3
 */