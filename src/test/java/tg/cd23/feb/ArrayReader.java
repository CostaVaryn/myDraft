package tg.cd23.feb;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArrayReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/test/java/tg/cd23/feb/example.txt");
            System.out.print("Reading char by char: \n");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

            System.out.print("\nReading using array: \n");
            char[] charArray = new char[10];
            fileReader.read(charArray);
            System.out.println(charArray); // bad symbols
            fileReader.close();
            System.out.println("FileReader closed!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
