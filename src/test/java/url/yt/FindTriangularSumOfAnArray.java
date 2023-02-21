package url.yt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTriangularSumOfAnArray {

    public static int triangleSum(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return eval(list);
    }

    public static int eval(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0) % 10;
        }
        List<Integer> inner = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            inner.add(list.get(i) % 10 + list.get(i + 1) % 10);
        }
        return eval(inner);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(triangleSum(arr));
    }
}
