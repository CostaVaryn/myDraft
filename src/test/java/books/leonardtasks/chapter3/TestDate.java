package books.leonardtasks.chapter3;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.parse("2020-06-01T11:20:15");
        // ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-06-01Т10:15:30+09:00[Asia/Tokyo]");

        DateTimeFormatter zonedDateTimeFormatter = DateTimeFormatter.ofPattern ("dd.ММ.yyyy, HH:mm:ssXXXXX '['VV']'");
        System.out.println(zonedDateTimeFormatter);
        // ZonedDateTime zonedDateTimeFormatted = ZonedDateTime.parse("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]", zonedDateTimeFormatter);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate = formatter.format(date);

        String stringLD = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        String stringLT = LocalTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        String stringLDT = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String stringZDT = ZonedDateTime.now()
                .format(DateTimeFormatter
                        .ofPattern("E МММ yyyy HH:mm:ss.SSSZ"));

        String odt2 = OffsetDateTime.now()
                .format(DateTimeFormatter
                        .ofPattern("E МММ yyyy HH:mm:ss.SSSZ"));

        String ot2 = OffsetTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss,Z"));
    }
}
