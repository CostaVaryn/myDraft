package stepik.javapracticeautotest.block4;

import java.util.Scanner;

public class SumEvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n <= 0) {
            sc.close();
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0) {
                    sum += arr[i];
                }
            }
            sc.close();
            System.out.println(sum);
        }
    }
}

/*
Напишите программу, которая должна получить на вход размерность массива больше нуля
и сам массив значений int и вернуть сумму четных чисел. Если четных чисел в массиве нет, сумма равна 0.

Sample Input:
5
23 25 27 29 31
Sample Output:
0
 */