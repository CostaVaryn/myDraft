package stepik.ProgrammingWorkshop.tasks2.iotasks1;

import java.util.Scanner;

public class Hypotenuse {
    private void run(int a, int b) {
        System.out.println((int) Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2))));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        new Hypotenuse().run(a,b);
    }
}

/*
Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.

Входные данные
В двух строках вводятся два числа (числа целые, положительные, не превышают 1000).
Выходные данные
Выведите ответ на задачу в виде целого числа

Sample Input:
6
8
Sample Output:
10
 */