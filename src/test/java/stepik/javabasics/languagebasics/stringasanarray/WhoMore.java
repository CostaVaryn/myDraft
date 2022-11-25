package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Scanner;

public class WhoMore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int countLetter = str.replaceAll("[^A-Za-zА-Яа-я]", "").length();
        int countDigit = str.replaceAll("[^0-9]", "").length();
        System.out.println(countLetter > countDigit ? "Letter" : countLetter == countDigit ? "Equal" : "Digit");
    }
}

/*
Вводится строка, определите, каких символов в ней больше: цифр или букв?
Напоминаю, что знаки препинания и пробелы, например, не являются ни тем ни другим.
Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter".
Если же их равное количество, то выведите слово "Equal".

Sample Input:
34Hi56
Sample Output:
Digit
 */