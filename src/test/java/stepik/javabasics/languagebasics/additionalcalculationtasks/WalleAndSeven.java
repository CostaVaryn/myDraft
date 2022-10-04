package stepik.javabasics.languagebasics.additionalcalculationtasks;

import java.util.Scanner;

public class WalleAndSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt(), d = sc.nextInt();
        System.out.println(n-(s*d));
    }
}

/*
ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц.
Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через d дней.

Входные данные:
Вводятся три целых неотрицательных числа:

n - количество страниц в книге
s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
d - количество дней
Выходные данные:
выведите на экран ответ на задачу: сколько страниц останется прочитать ВАЛЛ-И через d дней.

Sample Input 1:
100
10
3
Sample Output 1:
70
Sample Input 2:
800
30
10
Sample Output 2:
500
 */
