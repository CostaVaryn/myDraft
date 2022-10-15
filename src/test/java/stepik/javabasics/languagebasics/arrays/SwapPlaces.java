package stepik.javabasics.languagebasics.arrays;

import java.util.Scanner;

public class SwapPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rez = 0;
        sc.close();
        for (int j = 0; j < n; j++) {
            if (j == a) {
                rez = arr[j];
                arr[j] = arr[b];
            } else if (j == b) {
                arr[j] = rez;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
Дан список (сначала количество элементов, потом сами элементы).
Потом водятся два числа: a и b.
Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран построчно.
Гарантируется, что а и b не выходят за границы размеров массива.

Sample Input:
5
12
78
45
378
12
2
4
Sample Output:
12
78
12
378
45
 */