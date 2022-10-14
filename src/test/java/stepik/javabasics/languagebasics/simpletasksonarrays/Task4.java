package stepik.javabasics.languagebasics.simpletasksonarrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(array[sc.nextInt()] + array[sc.nextInt()]);
        sc.close();
    }
}

/*
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Напишите код, который создаст массив с именем array на n элементов,
в котором буду храниться введённые числа (элемент массива равен соответствующему числу в во второй строке).
На следующей строке вводится 2 числа - индексы элементов, сумму которых вам надо найти.
Выведите на экран сумму этих двух элементов. Гарантируется, что индексы лежат в диапазоне от 0 до n - 1.

Sample Input 1:
5
12 3 -4 6 2
0 3
Sample Output 1:
18
Sample Input 2:
3
9 -4 3
1 2
Sample Output 2:
-1
 */