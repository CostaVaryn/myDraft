package stepik.introductory.scanner.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrOneNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        sc.close();
        int b = line.replaceAll("\\s+","").length();

        if ( n < 0 || n >= b) {
            System.out.println("Неверный ввод");
        } else {
            String[] num = line.split(" ");
            Arrays.sort(num);
            System.out.println(num[n]);
        }
    }
}

/*
 * На вход подаётся целое число n, а на следующей строке - последовательность целых чисел через пробел,
 * Выведите число с индексом n. Если числа с таким индексом нет, выведите "Неверный ввод".
 *
 * Sample Input:
 * 4
 * 1 1 2 3 5 8
 * Sample Output:
 * 5
 */