package stepik.javabasics.languagebasics.simpletasksonarrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int j = 0; j < n; j++) {
            array[j] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

/*
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Допишите код, который создаст массив с именем array на n элементов,
в котором буду храниться введённые числа (элемент массива равен соответствующему числу в во второй строке).

Написанный код менять запрещено.

Sample Input 1:
5
12 3 -4 6 2
Sample Output 1:
12 3 -4 6 2
Sample Input 2:
3
9 -4 3
Sample Output 2:
9 -4 3
 */