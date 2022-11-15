package stepik.basoop.block1;

import java.util.Scanner;

public class LeapYearYN {
    public static void main(String[] args) {
        int year = 2022;
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
