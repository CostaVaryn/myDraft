package stepik.introductory.scanner.cycles.justwhile;

public class JustWhile {
    public static void main(String[] args) {
        int x = 5;
        String s = "start";

        while (x > 0) {
            if (x < 10) {
                s = "smaller";
            } else {
                s = "bigger";
            }
        }
        s = "end";
        System.out.println(s);
    }
}
