package tg.cd23.jan;

public class StrFormat {
    public static void main(String[] args) {
        String formatString = "Welcome %s, is now %d year!";
        System.out.println(String.format(formatString, "Robin", 2023));
    }
}
