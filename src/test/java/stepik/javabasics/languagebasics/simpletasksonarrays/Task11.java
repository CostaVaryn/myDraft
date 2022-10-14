package stepik.javabasics.languagebasics.simpletasksonarrays;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        int sum = 0;
        if ((k > 0) && (k <= n)) {
            for (int j = 0; j < k; j++) {
                sum += array[j];
            }
        }
        System.out.println(sum);
    }
}

/*
Вводится натуральное число n.
На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов.
Затем вводится число k. Найдите сумму первых k элементов.
Гарантируется, что 0 < k <= n.

Sample Input 1:
5
1 2 3 2 3
3
Sample Output 1:
3
Sample Input 2:
8
1 2 3 1 2 1 2 1
7
Sample Output 2:
12
 */