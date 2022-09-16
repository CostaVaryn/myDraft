package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForAlphabetWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); String[] y = sc.nextLine().split(" ");
        for(int i = 0; i < y.length; i++) {
            if(y[i].charAt(0) >= x.charAt(0) && y[i].charAt(0) <= x.charAt(2))
                System.out.println(y[i]);
        }
        sc.close();
    }
}

/**
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
