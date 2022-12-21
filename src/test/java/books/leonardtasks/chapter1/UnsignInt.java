package books.leonardtasks.chapter1;

import java.util.concurrent.ExecutionException;

public class UnsignInt {
    public static void main(String[] args) {
        String nri = "255500";
        int result = Integer.parseUnsignedInt(nri, Character.MAX_RADIX);
        System.out.println(result);
        int result2 = Integer.parseUnsignedInt(nri);
        System.out.println(result2);

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = Math.multiplyExact(x, y);
        System.out.println(z);

    }
}
