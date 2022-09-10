package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class ScanEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        int sum = a + b;
        int mul = a * b;
        if (sum % 2 == 0 && mul % 2 != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
