package stepik.javabasics.objectorientedprogramming.exceptionhandling.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String sep = File.separator;
        String path = sep + "Users" + sep + "adam" + sep + "Desktop" + sep + "test";

        File file = new File(path);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
