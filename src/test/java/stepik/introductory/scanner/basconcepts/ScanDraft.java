package stepik.introductory.scanner.basconcepts;

import java.util.Scanner;

public class ScanDraft {

    /**
     * Sample Input:
     * 365
     * Sample Output:
     * 5
     */

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();
            sc.close();
            int myVar = value % 10; // результат 5, т.к. остаток берется целочисленный от 36,5 остаток целое число 5
            System.out.print(myVar);
    }
}

