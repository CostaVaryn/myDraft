package stepik.javabasics.languagebasics.simpletasksonarrays;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > array[i-1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
Вводится натуральное число n (n > 1). На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Найдите количество элементов, которые больше предыдущего элемента.

Sample Input 1:
5
1 3 -4 6 2
Sample Output 1:
2
Sample Input 2:
4
5 3 2 0
Sample Output 2:
0
 */