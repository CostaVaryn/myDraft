package stepik.javabasics.languagebasics.tasksontheconditionaloperatorlevelA;

import java.util.Scanner;

public class NumberOfDigitsTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int n = str.length();
        System.out.println(n);
    }
}

/*
Вводится целое число n (0 < n < 1000). Определите, сколько в нём цифр. Выведите ответ на экран.

Sample Input 1:
8
Sample Output 1:
1
Sample Input 2:
23
Sample Output 2:
2
 */