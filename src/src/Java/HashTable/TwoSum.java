package Java.HashTable;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(a, target);
        for (int i = 0; i < a.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> no = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (no.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = no.get(target - nums[i]);
                return result;
            }
            no.put(nums[i], i);
        }
        return result;
    }
}
