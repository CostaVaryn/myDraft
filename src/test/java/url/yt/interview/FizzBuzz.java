package url.yt.interview;

public class FizzBuzz {
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";
    static final String FB = "FizzBuzz";

    public byte[] fbtest(int val) {
        StringBuilder sb = new StringBuilder();
        if (val % 3 == 0) sb.append(FIZZ);
        if (val % 5 == 0) sb.append(BUZZ);
        if (sb.length() > 0) return sb.toString().getBytes();

//        if (val % 15 == 0 ) {
//            return "FizzBuzz".getBytes();
//        } else if (val % 3 == 0) {
//            return "Fizz".getBytes();
//        } else if (val % 5 == 0) {
//            return "Buzz".getBytes();
//        }
        throw new IllegalArgumentException("Big trouble");
    }
}
