package stepik.introductory.scanner.cycles.justfor;

public class ForEasyInserted {
    public static void main(String[] args) {
        String s = "Java";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(s.charAt(i));
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
