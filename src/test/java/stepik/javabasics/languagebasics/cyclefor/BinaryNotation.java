package stepik.javabasics.languagebasics.cyclefor;

import java.util.Scanner;

public class BinaryNotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        String str = Integer.toBinaryString(N);
        System.out.println(new StringBuilder(str).reverse());
    }
}

/*
Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.

Sample Input:
6
Sample Output:
011
 */