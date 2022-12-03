package miniclasses;

import java.util.Scanner;

public class CasWin {
    public static void main(String[] args) {
        System.out.println("Я загадал число, угадаете? Введите число от 1 до 10: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n < 11) {
            int win = (int)(Math.random() * ((10 - 1) + 1)) + 1;
            if (win == n) {
                System.out.printf("Вы угадали число %d! Как?\n", n);
            } else {
                System.out.printf("Увы, число %d не было угадано(\n", win);
            }
        } else {
            System.out.println("Эх, ваше число не в том диапазоне, приходите завтра.");
        }

    }
}
