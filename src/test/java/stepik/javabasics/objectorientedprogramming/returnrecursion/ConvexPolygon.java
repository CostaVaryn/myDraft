package stepik.javabasics.objectorientedprogramming.returnrecursion;

import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ConvexPolygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] matrix;
        matrix = Stream.generate(() -> DoubleStream.generate(sc::nextDouble)
                .limit(2).toArray())
                .limit(n).toArray(double[][]::new);
        System.out.println(Math.round(perimeter(matrix) * 100) / 100.0);
        System.out.println(Math.round(area(matrix) * 100) / 100.0);
    }

    static double perimeter(double[][] matrix) {
        double per = 0;
        for (int i = matrix.length - 1; i >= 1; i--) {
            for (int j = 0; j < 1; j++) {
                per = per + Math.sqrt(Math.pow((matrix[i][j] - matrix[i - 1][j]), 2) +
                        Math.pow((matrix[i][j + 1] - matrix[i - 1][j + 1]), 2));
                if (i == 1) {
                    per = per + Math.sqrt(Math.pow((matrix[i - 1][j] - matrix[matrix.length - 1][j]), 2) +
                            Math.pow((matrix[i - 1][j + 1] - matrix[matrix.length - 1][j + 1]), 2));
                }
            }
        }
        return per;
    }

    static double area(double[][] matrix) {
        double area1 = 0;
        double area2 = 0;
        double[][] copy = new double[matrix.length+1][2];
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < 2; j++) {
                copy[i][j] = matrix[i][j];
            }
        }
        copy[matrix.length][0] = matrix[0][0];
        copy[matrix.length][1] = matrix[0][1];
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < 1; j++) {
                area1 = area1 + copy[i][j] * copy[i + 1][j + 1];
                area2 = area2 + copy[i][j + 1] * copy[i + 1][j];
            }
        }
        return Math.abs(area1 - area2) / 2;
    }
}

/*
Вводится число n (n >= 3), затем даются координаты n точек построчно.
Найдите периметр этого многоугольника и его площадь.
Выведите ответ построчно. Округлите ваш ответ до сотых.

Sample Input:
4
0 0
4 0
4 4
0 4
Sample Output:
16.0
16.0
 */