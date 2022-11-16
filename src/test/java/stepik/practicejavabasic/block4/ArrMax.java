package stepik.practicejavabasic.block4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            sc.close();
            System.out.println("Массив нулевого размера");
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            Arrays.sort(arr);
            System.out.println(arr[n - 1]);
        }
    }
}

/*
Напишите программу, которая получает из стандартного ввода размерность массива и все его элементы,
после чего ищет в нем максимум и выводит на печать.

Входной массив должен иметь не нулевой размер. Если указан нулевой размер сразу вывести "Массив нулевого размера".
Входной массив может содержать любое значение типа int.

Sample Input:
4
-2 0 10 5
Sample Output:
10
 */