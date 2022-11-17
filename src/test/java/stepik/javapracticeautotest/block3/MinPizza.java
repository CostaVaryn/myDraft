package stepik.javapracticeautotest.block3;

import java.util.Scanner;

public class MinPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int onePiz = sc.nextInt();
        int val = onePiz;
        int count = 0;
        count++;
        if (onePiz % people != 0) {
            while (onePiz % people != 0) {
                count++;
                onePiz += val;
            }
        }
        System.out.println(count);
    }
}

/*
Напишите программу, которая должна прочитать два значения из System.in:
количество людей
количество кусочков в одной пицце.
Гарантируется, что входные параметры — целые положительные числа.

Программа должна напечатать минимальное количество пицц (не ноль), которое надо заказать, чтобы у всех было одинаковое количество ломтиков и не осталось ни одного лишнего.

Sample Input:
12 8

Sample Output:
3
 */