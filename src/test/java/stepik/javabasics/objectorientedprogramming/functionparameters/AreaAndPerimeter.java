package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Map;
import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }

    static void perimeter(String figure, int x) {
        if (figure.equalsIgnoreCase("Квадрат")) {
            System.out.println(x * 4);
        }
        if (figure.equalsIgnoreCase("Круг")) {
            double pi = 3.14;
            int result = (int) Math.ceil(pi * 2 * x);
            System.out.println(result);
        }
    }

    static void area(String figure, int x) {
        if (figure.equalsIgnoreCase("Квадрат")) {
            System.out.println(x * x);
        }
        if (figure.equalsIgnoreCase("Круг")) {
            double pi = 3.14;
            int result = (int) Math.ceil(pi * (x * x));
            System.out.println(result);
        }
    }

}

/*
Необходимо написать программу для поиска площади и периметра квадрата или круга.
Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры и одно целое число
(либо радиус круга, либо сторону квадрата). Как результат они выводят периметр и площадь фигуры соответственно.
В ответ они должны вывести именно целое число (при надобности округлять "вверх",
то есть до ближайшего большего целого числа). Содержание функции main менять запрещено.
Пи брать как 3.14.

Sample Input 1:
Квадрат
5
Sample Output 1:
20
25

Sample Input 2:
Круг
3
Sample Output 2:
19
29
 */