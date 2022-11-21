package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrMassMultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++ ) {
                System.out.print(j < m? j * i + " " : j * i);
            }
            System.out.println();
        }
    }
}

/*
 * Два индийских программиста, Махатма и Джавахарлал, вдруг обнаружили,
 * что таблица умножения иногда весьма полезна для программистов, и решили её выучить.
 * Помогите нашим индийским друзьям!
 * На вход подаются числа n и m. Выведите таблицу умножения n * m (см. пример).
 *
 * Sample Input:
 * 3 4
 * Sample Output:
 * 1 2 3 4
 * 2 4 6 8
 * 3 6 9 12
 */
