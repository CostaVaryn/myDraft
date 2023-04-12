package url.yt.interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericArray {
    public static void main(String[] args) {
        String[] strings = GenericArray.convert(
                String.class,
                List.of("Str1", "Str2", "Str3")
        );
        System.out.println(Arrays.toString(strings));
    }

    public static <T> T[] convert(Class<T> clazz, List<T> values) {
        T[] array = (T[]) Array.newInstance(clazz, values.size());
        for (int i = 0; i < values.toArray().length; i++) {
            array[i] = values.get(i);
        }
        return array;
    }
}
