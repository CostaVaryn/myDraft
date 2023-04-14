package tg.cd23.mar;

public class StrAscii {
    public static void main(String[] args) {
        int[] ascii = {65, 66, 67, 68};
        String str = new String(ascii, 1, 3);
        System.out.println(str); //BCD
    }
}
