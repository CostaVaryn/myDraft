package tp.sortingalgorithms;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DataSort {
    public static void main(String[] args) {
        List<ObjectName> list = new ArrayList<ObjectName>();
        list.sort(new Comparator<ObjectName>() {
            public int compare(ObjectName o1, ObjectName o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        ObjectName[] arr = new ObjectName[10];
        Arrays.sort(arr, new Comparator<ObjectName>() {
            public int compare(ObjectName o1, ObjectName o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
    }
}
