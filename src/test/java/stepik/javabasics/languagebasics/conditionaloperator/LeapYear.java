package stepik.javabasics.languagebasics.conditionaloperator;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/*
По данному году определите, является ли он високосным.
Если год Високосный, то выведите "Yes", если же нет, то выведете "No"

Sample Input:
1993
Sample Output:
No
 */