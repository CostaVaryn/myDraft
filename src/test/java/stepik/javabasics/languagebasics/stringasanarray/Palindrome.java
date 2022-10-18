package stepik.javabasics.languagebasics.stringasanarray;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        System.out.println(reversed.equals(replaced) == true ? "YES" : "NO");
    }
}

/*
Вводится строка. определите, является ли она палиндромом.
Напоминаю,  что палиндром - это слово/строка, которая читается одинаково слева направо и справа налево.
В ответ выведите YES/NO.

Sample Input 1:
Тот
Sample Output 1:
YES

Sample Input 2:
А роза упала на лапу азора
Sample Output 2:
YES

Sample Input 3:
Аргентина манит негра
Sample Output 3:
YES

Sample Input 4:
sffgadhgcs v
Sample Output 4:
NO

Sample Input 5:
ttt 4t tt
Sample Output 5:
YES
 */