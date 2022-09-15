package stepik.introductory.scanner.cycles;

import java.util.Scanner;

public class WhileNumericalSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), count = 0, sum = 0;

        while (true) {
            count++;
            if (x % 11 == 0) {
                continue;
            }

            if (x % 3 == 0) {
                sum += x;
                break;
            }
        }

        sc.close();
        System.out.println(count);
        System.out.println(sum);
    }
}


/**
 * На вход подаются числа, которые делятся на 11.
 * Концом последовательности будет любое число, не делящееся на 11 (это число не входит в последовательность).
 * Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.
 *
 * Sample Input:
 * 11 22 33 121 99 15
 *
 * Sample Output:
 * 5
 * 132
 */
