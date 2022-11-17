package writer;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("C:\\Users\\...\\Desktop\\testFile.txt");
        out.write(data.getBytes());
        out.close();
    }
}
