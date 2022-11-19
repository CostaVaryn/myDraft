package stepik.javacore.mainmodule;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumAndOneMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}

/*
Необходимо написать программу на Java 11 (либо на совместимой версии):
На вход поступает целое число N > 1. На следующей строке расположена последовательность из N положительных чисел.
Требуется найти второе минимальное число в последовательности.

Sample Input:
2
5 11

Sample Output:
11
*/
