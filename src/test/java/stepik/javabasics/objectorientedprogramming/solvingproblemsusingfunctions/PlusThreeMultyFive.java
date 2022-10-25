package stepik.javabasics.objectorientedprogramming.solvingproblemsusingfunctions;

import java.util.Scanner;

public class PlusThreeMultyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(can(n));
    }

    static String can(int n) {
        if (n == 1) return "YES";
        if ((n - 1) % 3 == 0 || n % 5 == 0) return "YES";
        else return "NO";
    }

}

/*
Определить можно ли с использованием только операций «прибавить 3» и «умножить на 5» получить из числа 1 число 𝑁 (𝑁 - натуральное, не превышает 1 000 000). Разумеется, само число 1 получить можно, просто не применяя никаких операций.

Входные данные
Вводится число 𝑁.

Выходные данные
Выведите слово YES, если число 𝑁 можно получить из числа 1, или NO - в противном случае.

Sample Input 1:
1
Sample Output 1:
YES

Sample Input 2:
27
Sample Output 2:
NO
 */