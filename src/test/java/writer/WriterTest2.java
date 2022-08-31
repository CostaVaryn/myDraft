package writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class WriterTest2 {

    public static void main (String[] args) throws IOException {
        Files.createDirectories(Paths.get("C:\\Users\\cosva\\Desktop\\test\\1\\2\\3"));
        Files.createFile(Paths.get("C:\\Users\\cosva\\Desktop\\test\\readme.txt"));

    }
}
