package books.leonardtasks.chapter5;

public class FenwickTree {
    private final int n;
    private long[] tree;

    public FenwickTree(long[] values) {
        values[0] = 0L;
        this.n = values.length;
        tree = values.clone();
        for (int i = 1; i < n; i++) {
            int parent = i + lsb(i);
            if (parent < n) {
                tree[parent] += tree[i];
            }
        }
    }

    private static int lsb(int i) {
        return i & -i;
        // либо
        // return Integer.lowestOneBit(i);
    }

    public long sum(int left, int right) {
        return prefixSum(right) - prefixSum(left - 1);
    }

    private long prefixSum(int i) {
        long sum = 0L;
        while (i != 0) {
            sum += tree[i];
            i &= ~lsb(i); // либо i -= lsb(i);
        }
        return sum;
    }

    public void add(int i, long v) {
        while (i < n) {
            tree[i] += v;
            i += lsb(i);
        }
    }

    public void set(int i, long v) {
        add(i, v - sum(i, i));
    }

    public static void main(String[] args) {
        FenwickTree tree = new FenwickTree(new long[]{
                0, 3, 1, 5, 8, 12, 9, 7, 13, 0, 3, 1, 4, 9, 0, 11, 5
        });

        long sum29 = tree.sum(2, 9); // 55
        tree.set(4, 3);
        tree.add(4, 5);
    }
}
