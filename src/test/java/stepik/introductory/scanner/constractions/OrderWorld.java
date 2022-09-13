package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class OrderWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = "Джефф Безос", b = "Илон Маск", c = "Марк Цукерберг", d = "Билл Гейтс";

        if (str.contains(a) || str.contains(b) || str.contains(c) || str.contains(d)) {
            System.out.println("Добро пожаловать!");
        } else {

            System.out.println("Здесь никого нет, Вы ошиблись дверью");
        }
    }
}

/**
 * На ввод подаётся фраза-приветствие.
 * Выведите "Добро пожаловать!", если имя есть в списке, и "Здесь никого нет, Вы ошиблись дверью" - если нет.
 * Примечание. Буква "ё".
 *
 * Sample Input 1:
 * Это я, Билл Гейтс
 * Sample Output 1:
 * Добро пожаловать!
 * Sample Input 2:
 * Открывай, Абрамович пришёл!
 * Sample Output 2:
 * Здесь никого нет, Вы ошиблись дверью
 */
