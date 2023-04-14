package tg.cd23.mar;

import org.apache.commons.lang3.ArrayUtils;

public class ArrSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(isSorted(a));
    }

    public static boolean isSorted(int[] a) {
        return ArrayUtils.isSorted(a);
    }
}
