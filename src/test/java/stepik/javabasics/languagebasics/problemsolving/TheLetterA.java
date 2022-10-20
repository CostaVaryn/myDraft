package stepik.javabasics.languagebasics.problemsolving;

import java.util.Scanner;

public class TheLetterA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word;
        int count = 0;
        while (sc.hasNext()) {
            word = sc.next().toLowerCase();
            if (word.startsWith("а")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
Вводится строка.
Определите, сколько слов в ней начинается с маленькой или большой буквы а (только русской).
Словом считается любая последовательность символов, не содержащая пробелов.

Sample Input:
Алёнка, привет. Выходи к арке
Sample Output:
2
 */