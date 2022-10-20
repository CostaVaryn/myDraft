package stepik.javabasics.languagebasics.problemsolving;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int D = (b*b) - 4 * a * c;
        System.out.print(D);
    }
}

/*
С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0).
Вычислите дискриминант этого квадратного уравнения и выведите его на экран.

Sample Input:
1
-5
6
Sample Output:
1
 */