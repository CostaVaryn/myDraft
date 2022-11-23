package stepik.javabasics.languagebasics.arrays;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt(), s = sc.nextInt();
        sc.close();
        int n = 1001;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i * i * i;
        }
        System.out.println(a[f]);
        System.out.println(a[s]);
    }
}

/*
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

Sample Input:
8
11
Sample Output:
512
1331
 */