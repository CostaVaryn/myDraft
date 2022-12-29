package books.leonardtasks.chapter3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DayAfterDays {
    public static LocalDate getDayAfterDays(
            LocalDate startDate, int days) {
        Period period = Period.ofDays(days);
        TemporalAdjuster ta = p -> p.plus(period);
        LocalDate endDate = startDate.with(ta);
        return endDate;
    }

    static TemporalAdjuster NEXT_SATURDAY
            = TemporalAdjusters.ofDateAdjuster(today -> {
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY) {
            return today;
        }
        if (dayOfWeek == DayOfWeek.SUNDAY) {
            return today.plusDays(6);
        }
        return today.plusDays(6 - dayOfWeek.getValue());
    });

        public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 27);
        LocalDate firstDayOfFeb = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfFeb = date.with(TemporalAdjusters.lastDayOfMonth());
        //LocalDate datePlus21Days = DateTimes.getDayAfterDays(date, 21);

        LocalDate nextSaturday = date.with(NEXT_SATURDAY);
    }
}
