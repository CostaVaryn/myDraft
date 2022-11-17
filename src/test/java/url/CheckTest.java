package url;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckTest {
    public static void main(String[] args) throws IOException {
        String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
        URL url = new URL(image);
        InputStream input = url.openStream();
        Path path = Paths.get("C:\\GoogleLogo.png");
        Files.copy(input, path);
    }
}
