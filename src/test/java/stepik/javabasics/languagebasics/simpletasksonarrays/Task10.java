package stepik.javabasics.languagebasics.simpletasksonarrays;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == k) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Затем вводится число k. Найдите количество элементов в массиве равных k.

Sample Input 1:
5
1 2 3 2 3
3
Sample Output 1:
2
Sample Input 2:
8
1 2 3 1 2 1 2 1
1
Sample Output 2:
4
 */