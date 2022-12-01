package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(n + 1);
        System.out.print("-");
        System.out.print(n + 2);
        System.out.print("-");
        System.out.print(n + 3);
    }
}

/*
ВАЛЛ-И называет натуральное число, а ЕВА записывает 3 последовательных числа, следующих после него.
Напишите программу, которая выводит числа  ЕВЫ через черточку.

Входные данные:
натуральное число
Выходные данные:
выведите ответ на задачу

Sample Input:
8
Sample Output:
9-10-11
 */