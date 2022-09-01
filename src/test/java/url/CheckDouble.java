package url;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class CheckDouble {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
// отправляем данные
        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output))
        {
            sender.println("Привет");
        }

// читаем данные
        try(InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
    }
}
