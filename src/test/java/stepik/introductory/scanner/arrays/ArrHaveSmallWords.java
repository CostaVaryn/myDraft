package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrHaveSmallWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = str[0].length();
        sc.close();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < n ) {
                n = str[i].length();
            }
        }
        for (int j = 0; j < str.length; j++) {
            if (str[j].length() == n) {
                System.out.println(j + 1);
                break;
            }
        }
    }
}

/**
 * На вход подаётся строка текста.
 * Определите, в каком по счёту слове этого предложения меньше всего букв, и выведите на печать.
 * Если таких слов несколько, выведите номер первого по порядку.
 *
 * Sample Input:
 * Java is good
 * Sample Output:
 * 2
 */
