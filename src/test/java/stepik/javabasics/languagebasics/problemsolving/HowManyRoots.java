package stepik.javabasics.languagebasics.problemsolving;

import java.util.Scanner;

public class HowManyRoots {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        int D = (b * b) - (4 * a * c);
        System.out.println(D == 0 ? "1" : D > 0 ? "2" : 0);
    }
}

/*
С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения a*x2 + b*x + c = 0 (a != 0).
Определите, сколько корней будет у этого уравнения. Выведите на экран одно число - количество корней уравнения.

Sample Input:
1
-5
6
Sample Output:
2
 */