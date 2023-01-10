package Java.Array;

public class runningSum {
    public static int[] runningSum(int[] nums) {
        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            a[i] = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int []res = runningSum(arr);
        for (int i = 0; i<res.length; i++){
            System.out.println(res[i]);
    }
}}



