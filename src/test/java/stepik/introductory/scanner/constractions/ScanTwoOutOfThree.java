package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class ScanTwoOutOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 != 0) {
            System.out.println("true");
        } else if (a % 2 != 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println("true");
        } else if (a % 2 == 0 && b % 2 != 0 && c % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
