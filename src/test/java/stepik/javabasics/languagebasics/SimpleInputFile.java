package stepik.javabasics.languagebasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleInputFile {
    public static void main(String[] args) {
        String src = "notes1.txt";
        String dest = "notes3.txt";

        try(FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest)) {
            byte[] buffer = new byte[65536]; // 64Kb
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
