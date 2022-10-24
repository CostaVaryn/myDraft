package stepik.javabasics.objectorientedprogramming.solvingproblemsusingfunctions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        sort(mas);
        for(int i: mas)
            System.out.print(i + " ");
    }
    static void sort(int[] mas) {
        /*
        mas = Arrays.stream(mas).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(mas));
         */
        for (int i = 0; i < mas.length; i++) {
            mas[i] *= -1;
        }
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) {
            mas[i] *= -1;
        }
    }
}

/*
Дан массив, вам необходимо написать функцию, которая ничего не возвращает,
но меняет сам массив, а именно: сортирует его по убыванию. Содержание функции main менять запрещено.

Sample Input:
5
3 7 2 4 1
Sample Output:
7 4 3 2 1
 */