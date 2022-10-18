package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Scanner;

public class InterestingTranslation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder("");
        String intermediate = "";
        char[] chars = str.toCharArray();
        for (char oneChar : chars) {
            if (Character.isDigit(oneChar)) {
                intermediate += String.valueOf(oneChar);
            } else if (intermediate.length() > 0) {
                stringBuilder.append(Integer.toBinaryString(Integer.parseInt(intermediate)));
                stringBuilder.append(oneChar);
                intermediate = "";
            } else {
                stringBuilder.append(oneChar);
            }
        }
        if (intermediate.length() > 0) {
            stringBuilder.append(Integer.toBinaryString(Integer.parseInt(intermediate)));
        }
        System.out.println(stringBuilder);
    }
}

/*
Ввод и вывод данных производятся через стандартные потоки ввода-вывода.

На планете Роботов очень не любят десятичную систему счисления, поэтому они попросили Вас написать программу,
которая заменяет все встречающиеся в тексте числа на эти же числа, но в двоичной системе счисления.

Входные данные
Единственная строка, состоящая из любых символов. Длина строки не превышает 255 символов.
Гарантируется, что во всех числах нет ведущих нулей.

Выходные данные
Выведите преобразованную строку.

Sample Input:
2+4
Sample Output:
10+100
 */