package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        while (a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}

/*
Вводятся целые числа a и b. Гарантируется, что a не превосходит b.

Выведите все четные числа от a до b (включительно).

Sample Input:
1
9
Sample Output:
2
4
6
8
 */