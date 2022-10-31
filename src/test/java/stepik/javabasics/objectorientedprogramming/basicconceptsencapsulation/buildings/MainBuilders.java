package stepik.javabasics.objectorientedprogramming.basicconceptsencapsulation.buildings;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class MainBuilders {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Сегодня: " + format.format(date));
    }
}
