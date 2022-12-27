package tg.cd22.nov;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        String date = "14.11.2022";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dayWeek = null;
        try {
            dayWeek = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
    }
}
