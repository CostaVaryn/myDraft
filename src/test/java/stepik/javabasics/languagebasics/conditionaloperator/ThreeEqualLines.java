package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class ThreeEqualLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine(), s3 = sc.nextLine();
        sc.close();
        if (s1.equals(s2) && s2.equals(s3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/*
С клавиатуры построчно вводятся три строки. Необходимо определить, все ли он равны.
Если да, то вывести "Yes", в противном случае - "No".

Sample Input 1:
String
String
String
Sample Output 1:
Yes
Sample Input 2:
String
String
Not String
Sample Output 2:
No
 */
