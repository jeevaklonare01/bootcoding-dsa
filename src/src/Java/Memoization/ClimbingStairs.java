package Java.Memoization;

import java.util.HashMap;

public class ClimbingStairs {
    static HashMap<Integer, Integer> steps = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(climbStairs(4));

    }

    public static int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (steps.containsKey(n)) {
            return steps.get(n);
        }
        steps.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return steps.get(n);
    }
}
