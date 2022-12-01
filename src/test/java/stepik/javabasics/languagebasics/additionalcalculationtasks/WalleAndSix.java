package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        sc.close();
        System.out.println(n - (s * 5));
    }
}

/*
ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц.
Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через 5 дней.

Входные данные:
Вводятся два целых неотрицательных числа:

n - количество страниц в книге
s - количество страниц, которые прочитывает ВАЛЛ-И каждый день
Выходные данные:
выведите на экран ответ на задачу: сколько страниц останется прочитать ВАЛЛ-И через 5 дней.

Sample Input 1:
100
10
Sample Output 1:
50

Sample Input 2:
800
20
Sample Output 2:
700
 */
