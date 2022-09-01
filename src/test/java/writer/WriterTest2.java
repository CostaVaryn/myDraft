package writer;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.lang.System.load;
import static java.lang.System.out;


public class WriterTest2 {

    public static void main (String[] args) throws IOException {

        //Files.createDirectories(Paths.get("C:\\Users\\...\\Desktop\\test\\1\\2\\3"));

        String src = "C:\\Users\\...\\Desktop\\test\\1\\2\\3\\log.txt";
        InputStream newFile = Files.newInputStream(Paths.get(src));
        newFile.read();


        String data = "Test data, only string? This hope or no? Maybe need help?";

        OutputStream file = Files.newOutputStream(Paths.get("C:\\Users\\...\\Desktop\\test\\1\\readme122.txt"));
        file.write(data.getBytes());
        file.close();

        //Files.createFile(Paths.get("C:\\Users\\...\\Desktop\\test\\readme2.txt"));

        Path path = Paths.get("C:\\Users\\...\\Desktop\\test\\1\\readme122.txt");
        List<String> list = Files.readAllLines(path);
        for (String str : list)
            out.println(str);

        /**
         * Получаем объект со списком файлов
         * Цикл по списку файлов
         *
         *   Path paths = Paths.get("C:\\windows");
         *   try (DirectoryStream<Path> files = Files.newDirectoryStream(paths)) {
         *       for (Path paths1 : files)
         *           System.out.println(paths1);
         * }
         */
    }
}
