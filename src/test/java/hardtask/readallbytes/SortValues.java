package hardtask.readallbytes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import static java.util.Collections.sort;

public class SortValues {
    public void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
            FileInputStream stream = new FileInputStream(reader.readLine());
            //String str = new String(stream.readAllBytes());
            //String[] array = str.split("\r\n");

            reader.close();
            stream.close();

            List<Integer> list = new ArrayList<>();

            //for (int i = 0; i < array.length; i++)
               // list.add(Integer.parseInt(array[i]));

            List<Integer> listCopy = new ArrayList<>();
            listCopy.addAll(list);
            for(Integer number : listCopy)
                if (number % 2 != 0) list.remove(number);

            sort(list);

            for(Integer number : list)
                System.out.println(number);

        } catch (IOException ignored) {
        }
    }
}
