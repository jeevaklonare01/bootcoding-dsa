package Java.Memoization;

import java.util.HashMap;

public class FibonacciNumber {
    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        System.out.println(fibMemoization(8));
        long start2 = System.currentTimeMillis();
        System.out.println(fib(8));
        System.out.println("Total Time (memoization) (ms):"+(System.currentTimeMillis()-start1));
        System.out.println("Total Time (ms)"+(System.currentTimeMillis()-start2));

    }
    public static int fib(int n ){
        if(n==0 || n ==1){
            return n ;
        }
        return fib(n-1)+ fib(n-2);
    }

    public static int fibMemoization(int n){
        if(n==0 || n ==1){
            return n ;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        cache.put(n,fibMemoization(n-1)+ fibMemoization(n-2));
        return cache.get(n);
    }
}
