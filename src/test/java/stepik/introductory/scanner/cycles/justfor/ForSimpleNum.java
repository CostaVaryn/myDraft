package stepik.introductory.scanner.cycles.justfor;

import java.util.Scanner;

public class ForSimpleNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = 0;
        for (int i = 1; i<a; i++) {
            if (a%i == 0) {
                b++;
            }
        }
        if (a < 2) {
            System.out.print("false");
        } else if (b >= 2) {
            System.out.print("false");
        } else {
            System.out.print("true");
        }
    }
}
