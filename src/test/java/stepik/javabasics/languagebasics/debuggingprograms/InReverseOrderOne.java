package stepik.javabasics.languagebasics.debuggingprograms;

import java.util.Scanner;

public class InReverseOrderOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(; b>=a; b -= 2) {
            System.out.println(b);
        }
    }
}

/*
Вводятся два целых числа: a и b (a <=b ). Выведите на экран все числа от b до а через одно на разных строчках.

Sample Input:
3 11
Sample Output:
11
9
7
5
3
 */