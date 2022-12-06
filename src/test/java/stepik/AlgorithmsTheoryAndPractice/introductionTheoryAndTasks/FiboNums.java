package stepik.AlgorithmsTheoryAndPractice.introductionTheoryAndTasks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FiboNums {

    // Map<Integer, Integer> cache = new HashMap<>();
    List<BigInteger> cache = new ArrayList<>();
    {
        cache.add(BigInteger.ZERO);
        cache.add(BigInteger.ONE);
    }
    private BigInteger fiboNums(int n) {
        for (int i = cache.size(); i <= n; i++) {
            BigInteger res = cache.get(i - 1).add(cache.get(i - 2));
            cache.add(res);
        }
        return cache.get(n);
    }
    // int cnt;
    /*
    private BigInteger fiboNums(int n) {
        // cnt++;
        if (n < 2) {
            return BigInteger.valueOf(n);
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            BigInteger res = fiboNums(n - 1).add(fiboNums(n - 2));
            cache.put(n, res);
            return res;
        }
    }
     */
    private void run(int n) {
        System.out.println(n + ": " + fiboNums(n));
        // System.out.println(cnt + " calls");
    }
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        new FiboNums().run(100000);
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");

    }
}
