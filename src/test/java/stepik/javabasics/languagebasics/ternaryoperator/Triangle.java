package stepik.javabasics.languagebasics.ternaryoperator;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if ((a+b > c) || (a+c > b) || (b+c > a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/*
Вводятся три целых числа. Необходимо определить, существует ли треугольник с такими сторонами.
В ответ выведите "Yes"/"No".

Sample Input 1:
3 4 5
Sample Output 1:
Yes
Sample Input 2:
2 2 5
Sample Output 2:
No
 */