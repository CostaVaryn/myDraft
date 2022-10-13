package stepik.javabasics.languagebasics.arrays;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if ((i % 2 == 0 || i == 0 )) {
                sum += arr[i];
            }
        }
        sc.close();
        System.out.println(sum);
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0 || j == 0) {
                System.out.println(arr[j]);
            }
        }
    }
}

/*
Вводится массив (сначала количество элементов, потом сами элементы).
Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.

Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
 */