package books.leonardtasks.chapter2;

public class Function {
    private static final int N_UPPER_BOUND = 101;
    private final int n;
    public Function(int n) {
        if (n < 0 || n >= N_UPPER_BOUND) {
            throw new IndexOutOfBoundsException("...");
        }
        this.n = n;
    }
    public int yMinusX(int x, int y) {
        if (x < 0 || x > y || y >= n) {
            throw new IndexOutOfBoundsException ("...");
        }
        return y - x;
    }
    public static void main(String[] args) {
        Function f = new Function(50);
        int r = f.yMinusX(5, 20);
        System.out.println(r);
    }
}
