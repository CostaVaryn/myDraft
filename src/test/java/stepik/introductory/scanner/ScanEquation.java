package stepik.introductory.scanner;

import java.util.Scanner;

public class ScanEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = 5 * (x * x) + 2 * x + 11;
        System.out.println(y);
    }
}
