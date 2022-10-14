package stepik.javabasics.languagebasics.simpletasksonarrays;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        double multy = 0;
        double sum = 0;
        for (; l <= r; l++) {
            sum += array[l];
            multy++;
        }
        System.out.println(sum/multy);
    }
}

/*
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. На следующей строке вводятся два индекса: l и r.
Найдите среднее арифметическое всех элементов с индексами от l до r включительно.
Выведите в ответ одно действительное число. Гарантируется, что 0 <= l <= r < n.

Sample Input 1:
5
1 2 3 2 3
1 2
Sample Output 1:
2.5
Sample Input 2:
8
1 2 3 1 2 1 2 1
3 6
Sample Output 2:
1.5
 */