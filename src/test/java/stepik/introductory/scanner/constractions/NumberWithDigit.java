package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class NumberWithDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Math.abs(sc.nextInt()), y = Math.abs(sc.nextInt());
        int z = (x % 100) / 10;
        sc.close();
        if (x > 99 && x < 1000) {
            if (z == y) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("error");
        }
    }
}
