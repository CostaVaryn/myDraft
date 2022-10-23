package stepik.javabasics.objectorientedprogramming.returnrecursion;

import java.util.Scanner;

public class TheFirstRow {
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
        int ans = find_line7(mas);
        if (ans != -1)
            System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
        else
            System.out.println("Таких строк нет");
    }
    static int find_line7(int[][] mas) {
        int index = -1;
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                if (mas[i].length % 7 == 0) {
                    index = i+1;
                    return index;
                }
        }
        return index;
    }
}

/*
Напишите функцию find_line7, которая принимает на вход двумерный массив целых чисел
и возвращает в ответ индекс первой строчки, сумма элементов которой кратна 7.
Если такой строки нет, то возвращает значение -1. Содержание функции main менять запрещено.

Sample Input:
4
1 2 4 3 5
3 2 4 4 1
6 5 0 4 6 7 5
1 2 1 2 1 2 2 1 1
Sample Output:
Сумма строки под номером 2 кратна 7
 */