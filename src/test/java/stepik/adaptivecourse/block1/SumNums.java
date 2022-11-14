package stepik.adaptivecourse.block1;

import java.util.Scanner;

public class SumNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] arrStr = str.split("");
        int n = str.length();
        int sum = 0;
        for (String s : arrStr) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}

/*
The sum of digits of a three-digit number
Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.

Sample Input:
476

Sample Output:
17
 */