package stepik.introductory.scanner;

import java.util.Scanner;

public class ScanLeapYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        System.out.printf("%s",(year/4)+(year/400)-(year/100));
    }
}
