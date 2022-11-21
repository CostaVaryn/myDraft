package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrOneThreeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        String[] num = line.split(" ");
        System.out.print(num[0] + " ");
        for (int i = 1; i < num.length - 2; i += 2) {
            System.out.print(num[i + 1] + " " + num[i] + " ");
        }
        if (num.length % 2 == 0) {
            System.out.print(num[num.length - 1]);
        } else {
            System.out.print(num[num.length - 2] + " " + num[num.length - 1]);
        }
    }
}

/*
 * На ввод подаётся последовательность целых чисел.
 * Поменяйте местами соседние элементы последовательности (второй с третьим, четвёртый с пятым и т.д.),
 * кроме первого и последнего.
 * Если находится "одинокий" элемент, который не с чем поменять - необходимо оставить его на месте.
 *
 * Sample Input:
 * 1 2 3 4 5 6
 * Sample Output:
 * 1 3 2 5 4 6
 */
