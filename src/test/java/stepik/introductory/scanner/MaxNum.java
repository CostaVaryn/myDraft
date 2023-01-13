package stepik.introductory.scanner;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Math.abs(sc.nextInt());
        byte maxVal;
        maxVal = (byte) (num % 10);
        while (num > 0) {
            byte curVal = (byte) (num % 10);
            if (curVal > maxVal)
                maxVal = curVal;
            num /= 10;
        }
        System.out.println(maxVal);
    }
}
