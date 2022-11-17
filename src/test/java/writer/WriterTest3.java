package writer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriterTest3 {
    public static void main(String[] args) throws IOException {

        String src = "C:\\Users\\...\\Desktop\\test\\log.txt";
        OutputStream newFile = Files.newOutputStream(Paths.get(src));
        String dest = "C:\\Users\\...\\Desktop\\test\\copy.txt";

        try(FileReader reader = new FileReader(src);
            FileWriter writer = new FileWriter(dest)) {
                char[] buffer = new char[65536]; // 64Kb
                while (reader.ready()) {
                    int real = reader.read(buffer);
                    writer.write(buffer, 0, real);
            }
        }
    }
}
