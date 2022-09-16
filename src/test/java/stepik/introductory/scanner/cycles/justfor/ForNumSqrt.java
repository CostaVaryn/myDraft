package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForNumSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                for (int i = 2; i < 6; i++) {
                    int pow= (int) Math.pow(n,i);
                    System.out.print(pow + (i<5 ? " " : ""));
                }
                System.out.print("\n");
            }
        }
        sc.close();
    }
}

/**
 * На вход подаётся несколько целых чисел. Выведите эти числа, возведённые в степени от двух до пяти.
 * Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.
 * Примечание. Каждая строка вывода оканчивается числом, а не пробелом.
 *
 * Sample Input:
 * 1 2 3
 *
 * Sample Output:
 * 1 1 1 1
 * 4 8 16 32
 * 9 27 81 243
 */