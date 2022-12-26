package tg.cd22.dec;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLocalDate {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().plusWeeks(1));
        System.out.println(LocalDate.now().plusMonths(1));
        System.out.println(LocalDate.now().plusYears(1));
        System.out.println(LocalDate.now().plus(1, ChronoUnit.DECADES)); // plus 10 years
    }
}
