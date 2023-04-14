package tg.cd23.jan;

public class SortedStrOfArray {
    public static void main(String[] args) {
        String[] a = new String[]{"Bob", "Ron", "Adam"};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[i]) < 0) {
                    String helper = a[i];
                    a[i] = a[j];
                    a[j] = helper;
                }
            }
            System.out.println(a[i]);
        }
    }
}
