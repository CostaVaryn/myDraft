package stepik.adaptivecourse.block3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExitMain1 {
    private static final int POOL_SIZE = 50;
    public static void main(final String[] args) throws Exception {
        final ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            executor.submit(() -> System.out.printf("Running %s%n", Thread.currentThread().getName()));
        }
        executor.shutdownNow();
    }
}
