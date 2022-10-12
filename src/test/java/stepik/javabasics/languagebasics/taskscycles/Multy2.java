package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class Multy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        sc.close();
        long multi = 1;
        for (long i = a; i <= b; i++) {
            multi *= i;
        }
        System.out.println(multi);
    }
}

/*
Вводится 2 целых числа a и b (a <= b). Необходимо вычислить произведение всех чисел от а до b включительно

Входные данные
Заданы два целых числа а и b

Выходные данные
Выведите единственное число - ответ на задачу.

Примечание
В этой задаче есть достаточно большой тест, поэтому используйте тип данных long.

Sample Input:
1
5
Sample Output:
120
 */