package stepik.javabasics.languagebasics.ternaryoperator;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        double c = Math.sqrt(Math.round(Math.pow(a,2) + Math.pow(b,2)));
        System.out.println(c);
    }
}

/*
Вводится два целых числа - длины катетов прямоугольного треугольника. Найдите гипотенузу этого треугольника.

Sample Input 1:
3 4
Sample Output 1:
5.0

Sample Input 2:
5 12
Sample Output 2:
13.0
 */