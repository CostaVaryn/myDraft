package stepik.javabasics.languagebasics.cycleconceptwhile;

import java.util.Scanner;

public class MorningRunning {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();
        int count = 1;
        while (x < y) {
            x *= 1.1;
            count++;
        }
        System.out.println((Integer) count);
    }
}

/*
В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.

Входные данные
Программа получает на вход действительные числа x и y

Выходные данные
Программа должна вывести одно натуральное число.

Sample Input:
10
20
Sample Output:
9
 */