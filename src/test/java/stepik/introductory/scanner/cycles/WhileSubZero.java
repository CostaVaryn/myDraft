package stepik.introductory.scanner.cycles;

import java.util.Scanner;

public class WhileSubZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, sum = 0;
        while ((x=sc.nextInt()) != 0 ) {
            sum += x;
        }
        System.out.println(sum);
    }
}

/**
 * Считайте со ввода последовательность целых чисел.
 * Последовательность оканчивается числом 0.
 * Выведите на печать сумму введённых чисел.
 * Sample Input:
 * 1 2 3 4 5 0
 * Sample Output:
 * 15
 */
