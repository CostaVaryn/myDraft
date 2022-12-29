package books.leonardtasks.chapter3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AgeDate {
    public static void main(String[] args) {
        LocalDate startLocalDate = LocalDate.of(1977, 11, 2);
        LocalDate endLocalDate = LocalDate.now();

        long years = ChronoUnit.YEARS.between(startLocalDate, endLocalDate);
        System.out.println((int) years);

        Period periodBetween = Period.between(startLocalDate, endLocalDate);
        System.out.println(periodBetween);
    }
}
