package stepik.introductory.scanner.constractions;

import java.util.Scanner;

public class SwitchScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "System.out.println()":
                System.out.println("Это команда вывода на печать");
                break;
            case "if":
                System.out.println("Это условный оператор");
                break;
            case "else":
                System.out.println("Это альтернативная конструкция условного оператора");
                break;
            default:
                System.out.println("Раздел в разработке");
        }
        sc.close();
    }
}
