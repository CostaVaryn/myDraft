package stepik.javacore.mainmodule;

import java.util.Scanner;

public class PlusNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        //sc.next();
        String s2 = sc.next();
        sc.close();
        System.out.println(minus(s1, s2));
    }

    public static String minus(String s11, String s22) {
        StringBuilder buf = new StringBuilder();
        for (int i1 = s11.length() - 1, i2 = s22.length() - 1, carry = 0;
             i1 >= 0 || i2 >= 0 || carry != 0;
             i1--, i2--) {
            int digit1 = i1 < 0 ? 0 :
                    Integer.parseInt(Character.toString(s11.charAt(i1)));
            int digit2 = i2 < 0 ? 0 :
                    Integer.parseInt(Character.toString(s22.charAt(i2)));

            int digit = digit1 + digit2 + carry;
            if (digit > 9) {
                carry = 1;
                digit -= 10;
            } else {
                carry = 0;
            }

            buf.append(digit);
        }
        return buf.reverse().toString();
    }
}
