package codingbat.warmup2;

public class ArrayCount9 {
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 9};
        int[] arr2 = new int[]{1, 9, 9};
        int[] arr3 = new int[]{1, 9, 9, 3, 9};
        System.out.println(arrayCount9(arr1));
        System.out.println(arrayCount9(arr2));
        System.out.println(arrayCount9(arr3));
    }
}
