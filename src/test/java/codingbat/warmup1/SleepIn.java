package codingbat.warmup1;

public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static void p(Boolean bool) {
        System.out.println(bool);
    }

    public static void main(String[] args) {
        p(sleepIn(false, false));
        p(sleepIn(true, false));
        p(sleepIn(false, true));
        p(sleepIn(true, true));
    }
}
