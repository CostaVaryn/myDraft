package stepik.javabasics.languagebasics.simpletasksonarrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        int count = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == k) {
                count = i;
            }
        }
        System.out.println(count == -1 ? "Error" : count);
    }
}

/*
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Затем вводится число k. Найдите индекс элемента k.
Если такого элемента нет в массиве, выведите на экран слово Error.

Sample Input 1:
5
1 2 3 5 4
5
Sample Output 1:
3
Sample Input 2:
8
1 34 56 23 76 56 90 4
3
Sample Output 2:
Error
 */