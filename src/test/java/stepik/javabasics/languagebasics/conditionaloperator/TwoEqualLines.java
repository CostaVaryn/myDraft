package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class TwoEqualLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        sc.close();
        if ((s1.equals(s2) && !s1.equals(s3)) || (s1.equals(s3) && !s1.equals(s2)) || (s2.equals(s3) && !s2.equals(s1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/*
С клавиатуры построчно вводятся три строки.
Если среди них есть ровно две равные строки то вывести "Yes", в противном случае - "No".

Sample Input 1:
String
Hello!
String
Sample Output 1:
Yes

Sample Input 2:
hello
String
Not String
Sample Output 2:
No
 */