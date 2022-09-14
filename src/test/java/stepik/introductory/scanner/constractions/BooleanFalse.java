package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class BooleanFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        boolean z = a == 12 || b != 5 && c <= 10;
        System.out.println(z);
        sc.close();
    }
}
