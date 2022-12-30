package books.leonardtasks.chapter5;

public class ContainsElementObject {
    public static <T> boolean containsElementObject(T[] arr, T toContain) {
        for (T elem: arr) {
            if (elem.equals(toContain)) {
                return true;
            }
        }
        return false;
    }
}