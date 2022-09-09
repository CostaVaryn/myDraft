package stepik.introductory.scanner;

import java.util.Scanner;

class ScannerZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int z = ((x+1)/(y-1))+((y+1)/(x-1));
        System.out.println(z);

        char a, b, c;
        a = 80;
        b = 'J';
        c = 8986;
        System.out.println(a); // P
        System.out.println(b); // J
        System.out.println(c); // ⌚

        /**
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (--x; x < 12; x++) {
            System.out.print(x+" ");
        }
        */

        // int x = sc.nextInt();
        // double y = sc.nextDouble();
        // String s = sc.nextLine();

        // System.out.printf("Температура %d градусов", x);
        // or
        // System.out.println("Температура " + x + " градусов");

    }
}