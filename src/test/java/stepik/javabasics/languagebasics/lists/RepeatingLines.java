package stepik.javabasics.languagebasics.lists;

import java.util.Scanner;

public class RepeatingLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pow = "повторение";
        boolean is_0 = false;
        while (sc.hasNextLine()) {
            String[] strs = sc.nextLine().toLowerCase().split(" ");
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].equalsIgnoreCase(pow)) {
                    is_0 = true;
                }
            }
        }
        System.out.println(is_0 ? "YES" : "NO");
    }
}

/*
Напишите программу, которая считает строку и определит, есть ли в ней именно слово "повторение".
Слово может быть написано как с маленькой, так и с большой буквы.
Гарантируется, что знаки препинания из текста были удалены. На экран выведите YES/NO.

Sample Input:
Повторение мать учения
Sample Output:
YES
 */