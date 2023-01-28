package Java.Array;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] a = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[nums[i]];
        }
        return a;
    }
}

