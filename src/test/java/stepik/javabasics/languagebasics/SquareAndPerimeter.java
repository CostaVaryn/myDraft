package stepik.javabasics.languagebasics;

import java.util.Scanner;

public class SquareAndPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int per = 2 * (a + b);
        int square = a * b;
        System.out.println(square);
        System.out.println(per);
    }
}

/*
На одной строчке через пробел записаны два целых числа: длина и ширина прямоугольника.
Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках.

Sample Input:
5 10
Sample Output:
50
30
 */
