package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class AverageAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sumAge = 0;
        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            double age = sc.nextDouble();
            sumAge += age;
        }
        System.out.println(sumAge/n);
    }
}

/*
В компьютер вводятся по очереди данные об имени и возрасте n учащихся класса. Напишите программу, которая вычисляет средний возраст учащихся класса.

Входные данные
Вводится натуральное число n - количество человек в классе. Затем вводится n пар строчек. Каждая пара состоит из имени и возраста ученика.

Выходные данные
Выведите единственное действительное число - ответ на задачу.

Sample Input 1:
3
Иван
15
Маша
14
Олег
13
Sample Output 1:
14.0

Sample Input 2:
2
Игорь
13
Ваня
12
Sample Output 2:
12.5
 */