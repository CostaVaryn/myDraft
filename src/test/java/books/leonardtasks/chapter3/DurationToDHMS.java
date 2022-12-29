package books.leonardtasks.chapter3;

import java.time.Duration;

public class DurationToDHMS {
    public static String durationToDHMSN(Duration duration) {
        StringBuilder sb = new StringBuilder();
        sb.append(duration.toDays())
                .append("d:")
                .append(duration.toHours())
                .append("h:")
                .append(duration.toMinutes())
                .append("m:")
                .append(duration.toMillis())
                .append("s:")
                .append(duration.toNanos())
                .append("n");
        return sb.toString();
    }
}
