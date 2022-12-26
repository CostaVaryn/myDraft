package tg.cd22.dec;

import java.util.Arrays;

public class TestSplit {
    public static void main(String[] args) {
        String line = "I am a java tester";
        String[] words = line.split(" ");
        String[] twoWords = line.split(" ", 2);
        System.out.println("String split with delimiter: " + Arrays.toString(words));
        System.out.println("String split into two: " + Arrays.toString(twoWords));

        String wordsWithNumbers = "I|am|a|java|tester";
        String[] numbers = wordsWithNumbers.split("\\|");

        System.out.println("String split with special character: " + Arrays.toString(numbers));
    }
}
