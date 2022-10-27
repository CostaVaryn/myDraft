package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        geron(s1, s2, s3);
    }
    static void geron(Double a, Double b, Double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double P = (a+b+c)/2;
            double S = Math.sqrt(P*((P - a)*(P - b)*(P - c)));
            System.out.println(S);
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}

/*
Sample Input:
3
4
5
Sample Output:
6.0
 */