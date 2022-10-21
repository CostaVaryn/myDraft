package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Scanner;

public class MonotonicNonDecreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        monneub(mas);
    }
    static void monneub(int[] arr) {
        int count = 0;
        int count2 = 0;
        int z = 0;
        int[] counts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                if (arr[i] < arr[i + 1]) {
                    count++;
                    if (i + 2 == arr.length) {
                        counts[z] = count;
                    }
                } else if (arr[i] == arr[i + 1]) {
                    count++;
                    if (i + 2 == arr.length) {
                        counts[z] = count;
                    }
                } else {
                    counts[z] = count;
                    count = 0;
                    z++;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > count2) {
                count2 = counts[i];
            }
        }
        if (arr.length != 0) {
            System.out.println(count2 + 1);
        } else {
            System.out.println(0);
        }
    }
}

/*
Напишите функцию monneub, которая принимает как аргумент массив целых чисел и находит
длину максимального монотонно не убывающего промежутка и выведите её на экран.
Содержание функции main менять запрещено.

Sample Input:
10
1 2 3 1 3 4 5 1 1 3
Sample Output:
4
 */