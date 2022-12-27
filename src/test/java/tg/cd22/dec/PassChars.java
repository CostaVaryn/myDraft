package tg.cd22.dec;

import java.util.Random;

public class PassChars {
    public static void main(String[] args) {
        int len = 10;
        System.out.println(geek_pass(len));
    }
    static char[] geek_pass(int len) {
        // System.out.println("Generating password using random()");
        System.out.println("Your new password is: ");
        String cap_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_-=+/.?<>()[]|";
        String values = cap_chars + small_chars + numbers + symbols;

        Random random = new Random();
        char[] pass = new char[len];
        for (int i = 0; i < len; i++) {
            pass[i] = values.charAt(random.nextInt(values.length()));
        }
        return pass;
    }
}
