package hardtask;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Date;

public class MainFormatter {
    public static void main(String[] args) {
        int planet = 7;
        String event = "a disturbance in the Force";

        String result = MessageFormat.format(
                "At {1, time} on {1, date}, there was {2} on planet {0, number, integer}.",
                planet, new Date(), event
        );
        System.out.println(result);
        System.out.println("__________________________");
        Double[] strs = new Double[]{7.99, 9.99, 15.99, 29.99, 49.99, 129.94};
        for (Double d : strs) {
            Double val = d * 0.08;
            System.out.println(String.format("%.2f", val).replace(",", "."));
        }
    }
}
