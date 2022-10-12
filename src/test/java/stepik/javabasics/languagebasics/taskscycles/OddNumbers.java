package stepik.javabasics.languagebasics.taskscycles;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.print(i%2==0 ? " " : i);
        }
    }
}

/*
Составьте программу, которая в одну строку через пробел выводит все нечетные цифры.

Sample Input:

Sample Output:
1 3 5 7 9
 */