package books.leonardtasks.chapter3;

import java.time.Period;

public class PeriodToYMD {
    public static String periodToYMD(Period period) {
        StringBuilder sb = new StringBuilder();
        sb.append(period.getYears())
                .append("у:")
                .append(period.getMonths())
                .append("m:")
                .append(period.getDays())
                .append("d");
        return sb.toString();
    }
}
