package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrOneNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        String line = sc.nextLine();
        String[] num = line.split(" ");
        System.out.println(num[n]);
    }
}

/**
 * На вход подаётся целое число n, а на следующей строке - последовательность целых чисел через пробел,
 * Выведите число с индексом n. Если числа с таким индексом нет, выведите "Неверный ввод".
 *
 * Sample Input:
 * 4
 * 1 1 2 3 5 8
 * Sample Output:
 * 5
 */