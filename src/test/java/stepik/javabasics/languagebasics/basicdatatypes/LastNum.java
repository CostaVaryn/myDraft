package stepik.javabasics.languagebasics.basicdatatypes;

import java.util.Scanner;

public class LastNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(a % 10);
    }
}

/*
Дано произвольное положительное натуральное число. Найдите его последнюю цифру.

Sample Input:
345
Sample Output:
5
 */
