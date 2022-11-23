package stepik.introductory.scanner.cycles.justwhile;

import java.util.Scanner;

public class WhileAlphabetWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String let1 = sc.next(), let2 = sc.next();
        int val1 = let1.charAt(0), val2 = let2.charAt(0);
        while (sc.hasNext()) {
            String str = sc.next();
            if ((str.charAt(0) >= val1) && (str.charAt(0) <= val2)) {
                System.out.println(str);
            }
        }
        sc.close();
    }
}

/*
 * На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов.
 * Выведите на печать все слова, которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно).
 * Вывести слова необходимо в том же порядке, в котором они подаются на вход.
 *
 * Sample Input:
 * j p
 * java python c++ kotlin php sql http css javascript r go
 *
 * Sample Output:
 * java
 * python
 * kotlin
 * php
 * javascript
 */
