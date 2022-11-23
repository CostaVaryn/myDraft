package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScanIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        if (a > b) {
            System.out.println("Махатма");
        } else {
            System.out.println("Джавахарлал");
        }

        // System.out.print(sc.nextInt() > sc.nextInt() ? "Махатма" : "Джавахарлал");
    }
}
