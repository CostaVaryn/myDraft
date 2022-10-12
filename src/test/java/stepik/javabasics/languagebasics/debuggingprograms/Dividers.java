package stepik.javabasics.languagebasics.debuggingprograms;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
Вводится натуральное число n. Необходимо определить количество его делителей.

Sample Input:
100
Sample Output:
9
 */