package stepik.javabasics.languagebasics;

import java.util.Scanner;

public class NumsThreeMultiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(a*b*c);
    }
}

/*
Напишите программу, которая считывает три целых числа и выводит их произведение.
Sample Input 1:
5 4 2
Sample Output 1:
40
Sample Input 2:
0
3
78
Sample Output 2:
0
 */
