package stepik.javabasics.objectorientedprogramming.functionparameters;

import java.util.Scanner;

public class FizzBuzzApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();
        FizzBuzz(begin, end);
        // \u000a System.out.println("Hello Kitty!");
        String monthString;
        //mInfoTextView.setText(monthString);
    }
    static void FizzBuzz(int a, int b) {
        if (a > b) {
            return;
        }
        for (; a <= b; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 3 != 0 && a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 == 0 && a % 5 != 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(a);
            }
        }
    }

}
