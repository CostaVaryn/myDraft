package books.leonardtasks.chapter5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ImmutableArray<T> {
    private final T[] array;
    private ImmutableArray(T[] a) {
        array = Arrays.copyOf(a, a.length);
    }
    public static <T> ImmutableArray<T> from(T[] a) {
        return new ImmutableArray<>(a);
    }
    public T get(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        ImmutableArray<String> sample =
            ImmutableArray.from(new String[] {
                "a", "b", "c"
        });

        Map<Integer, Melon> mapOfMelon = new HashMap<>();
        mapOfMelon.put(1, new Melon("Apollo", 3000));
        mapOfMelon.put(2, new Melon("Jade Dew", 3500));
        mapOfMelon.put(3, new Melon("Cantaloupe", 1500));

        Melon melon = mapOfMelon.replace(2, new Melon("Gac", 1000));

    }
}

