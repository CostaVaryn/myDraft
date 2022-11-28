package stepik.javabasics.languagebasics.problemsolving;

import java.util.Scanner;

public class MultiplesOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        while (n != 0) {
            if (n % 3 == 0) {
                if (n > max) {
                    max = n;
                }
            }
            n = sc.nextInt();
        }
        sc.close();
        System.out.println(max > 0 ? max : "404");
    }
}

/*
Последовательность состоит из натуральных чисел и завершается числом 0.
Определите максимальный элемент кратный 3.
Если такого элемента нет, то выведите на экран "404".

Числа, следующие за числом 0, считывать не нужно.

Sample Input:
1 2 3 4 5 6 7 6 5 9 4 3 2 4 5 6 8 10 0
Sample Output:
9
 */