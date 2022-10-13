package stepik.introductory.scanner.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Используем список, поскольку изначально неизвестно количество слов.
        ArrayList<String> words = new ArrayList<>();

        StringBuilder currentWord = new StringBuilder();
        for (Character letter : s.toCharArray()) {
            // Прерываем формирование слова, если встретили пробел
            if (letter.equals(' ')) {
                if (currentWord.length() > 0) {
                    // Записываем слово в список, если оно содержит хотя бы 1 символ
                    words.add(currentWord.toString());
                    currentWord = new StringBuilder();
                }
            } else {
                currentWord.append(letter);
            }
        }
        // При завершении не забываем, что в билдере могло остаться слово.
        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }
    }
}
