package tg.cd23.feb;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/java/tg/cd23/feb/example.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("Если бы в Java действительно работала сборка мусора,\n " +
                "большинство программ бы удаляли сами себя при первом же запуске.\n" +
                "Robert Sewell. Программист.");
        writer.flush();
        writer.close();
        FileReader fileReader = new FileReader(file);
//        char[] a = new char[(int) file.length()];
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
//        char[] a = new char[146];
//        System.out.println(fileReader.getEncoding());
//        fileReader.read(a);
//        for (char c : a)
//            System.out.print(c);
        fileReader.close();

    }
}
