package stepik.javabasics.objectorientedprogramming.returnrecursion;

import java.util.Scanner;

public class ConditionsGuards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        findRadius(a,b,c);
    }
    static void findRadius(int a, int b, int c) {
        //для удобства сделаем так, чтобы в переменной c лежала длина самой длинной стороны.
        if (a > c) {
            int d = a; a = c; c = d;
        }
        if (b > c) {
            int d = b; b = c; c = d;
        }
        //теперь в пересенной c лежит наибольшее значение из 3
        //проверим, что такой треугольник существует
        if (c >= a + b) {     //первый стражник: проверяет, что такой треугольник существует
            System.out.println("Треугольника с такими сторонами не существует");
            return;
        }
        if (c * c != a * a + b * b) { //второй стражник: проверяет, что треугольник прямоугольный
            System.out.println("Этот треугольник не прямоугольный");
            return;
        }
        //вот тут всё в порядке, находим радиус по формуле
        double r = (a + b - c) / 2.0;
        System.out.println("Радиус вписанной окружности равен: " + r);
    }
}
