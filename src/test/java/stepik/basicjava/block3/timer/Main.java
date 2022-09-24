package stepik.basicjava.block3.timer;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        // long time = timer.measureTime(() -> new BigDecimal("1234567").pow(100000));
        long time = timer.measureTime(Main::bigDecimalPower);
        System.out.println(time);
    }

    private static void bigDecimalPower() {
        new BigDecimal("1234567").pow(100000);
    }
}
