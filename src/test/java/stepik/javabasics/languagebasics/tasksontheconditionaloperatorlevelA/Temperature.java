package stepik.javabasics.languagebasics.tasksontheconditionaloperatorlevelA;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double now = sc.nextDouble();
        double normal = 22.4;
        if (now >= normal) {
            System.out.println(now == normal ? "Прохладно..." : "Тепло!");
        } else {
            System.out.println("Холодно(");
        }
    }
}

/*
Вводится одно действительное число - температура воздуха на улице.
Если она меньше, чем 22.4 градуса, то вывести "Холодно(", если больше, то вывести "Тепло!",
если ровно 22.4 градуса, то вывести "Прохладно...".

Sample Input 1:
19.3
Sample Output 1:
Холодно(
Sample Input 2:
33.1
Sample Output 2:
Тепло!
 */