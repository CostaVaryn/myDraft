package stepik.javabasics.languagebasics.tasksontheconditionaloperatorlevelA;

import java.util.Scanner;

public class NumberOfDigitsOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 10 && n < 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/*
Вводится целое число n (0 < n < 1000). Определите, является ли оно двузначным? Выведите в ответ "Yes"/"No".

Sample Input 1:
8
Sample Output 1:
No
Sample Input 2:
23
Sample Output 2:
Yes
 */