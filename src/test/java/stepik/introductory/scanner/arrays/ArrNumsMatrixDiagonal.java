package stepik.introductory.scanner.arrays;

import java.util.Scanner;

public class ArrNumsMatrixDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            if (str.length == n) {
                break;
            }
            System.out.print(str[n] + " ");
            n++;
        }
    }
}

/**
 * На вход подаётся матрица (двумерный массив).
 * Все элементы матрицы - целые числа.
 * Напечатайте главную диагональ матрицы в одной строке, через пробел.
 *
 * Sample Input:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Sample Output:
 * 1 5 9
 */
