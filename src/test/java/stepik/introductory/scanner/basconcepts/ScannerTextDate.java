package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScannerTextDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yy = sc.nextInt();
        String mm = sc.next();
        int dd = sc.nextInt();
        System.out.println(dd+":"+mm+":"+yy);
    }
}
