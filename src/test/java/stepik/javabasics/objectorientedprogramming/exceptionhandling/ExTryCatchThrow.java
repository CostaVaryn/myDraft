package stepik.javabasics.objectorientedprogramming.exceptionhandling;

import java.util.Scanner;

public class ExTryCatchThrow {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число от 0 до 30: ");
            int x = in.nextInt();
            if (Character.isDigit(x)) {
                if (x > 30 || x < 0) {
                    throw new Exception("Число х должно быть меньше 30");
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}
