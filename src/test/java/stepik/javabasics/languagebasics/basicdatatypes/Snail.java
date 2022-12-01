package stepik.javabasics.languagebasics.basicdatatypes;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        int q = h - b;
        int p = a - b;
        int x = (h - 2 * b + a - 1)/(a - b);
        System.out.println(x);
    }
}

/*
Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров.
На какой день улитка доползёт до вершины шеста?

Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
Программа должна вывести одно натуральное число.

Sample Input 1:
10
3
2
Sample Output 1:
8
Sample Input 2:
20
7
3
Sample Output 2:
5
 */