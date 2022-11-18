package stepik.javacore.mainmodule;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int index = sc.nextInt();
        int id = 0;
        boolean isprime;
        int[] arr = new int[100000];
        if (1 <= index && index <= 100000) {
            for(i = 2; i < 100; i++) {
                isprime = true;
                // проверить, делится ли число без остатка
                for (j=2; j <= i / j; j++)
                    // если число делится без остатка, значит, оно не простое
                    if((i % j) == 0) isprime = false;
                if (isprime) {
                    arr[id] = i;
                    id++;
                }
                    System.out.println(arr[index]);
            }
        }
    }
}

/**
 * Необходимо написать программу на Java 11 (либо на совместимой версии):
 * На вход поступает целое число 1 <= N <= 100000.
 * Требуется найти N-ое по счету простое число (что такое простые числа?).
 * Sample Input:
 * 1
 * Sample Output:
 * 2
 */
