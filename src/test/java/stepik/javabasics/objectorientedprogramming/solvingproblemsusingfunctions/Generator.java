package stepik.javabasics.objectorientedprogramming.solvingproblemsusingfunctions;

import java.util.Scanner;

public class Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        chain(n,m);
    }
    static void chain (int n, int m) {
        if (n == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.println(j);
                }
            }
        }
        if (n == 2) {
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.println(i + " " + j);
                }
            }
        }
        if (n == 3) {
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= m; j++) {
                    for (int k = 1; k <= m; k++) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        if (n == 4) {
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= m; j++) {
                    for (int k = 1; k <= m; k++) {
                        for (int l = 1; l <= m; l++) {
                            System.out.println(i + " " + j + " " + k + " " + l);
                        }
                    }
                }
            }
        }
    }
}

/*
Даны два натуральных числа N и K.
Требуется вывести все цепочки x1, x2, ..., xN такие, что xi - натуральное и 1 ≤ xi ≤ K.

Входные данные
Вводятся два натуральных числа N и K (N, K ≤ 6).

Выходные данные
Выведите все требуемые цепочки в произвольном порядке – по одной на строке.
Никакая цепочка не должна встречаться более одного раза.

Sample Input:
2 3
Sample Output:
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
 */