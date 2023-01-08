package books.leonardtasks.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ShallowCopy {
    @SuppressWarnings("unchecked")
    public static <K, V> HashMap<K, V> shallowCopy(Map<K, V> map) {
        Set<Map.Entry<K, V>> entries = map.entrySet () ;
        HashMap<K, V> copy = (HashMap<K, V>) entries.stream()
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return copy;
    }
}
