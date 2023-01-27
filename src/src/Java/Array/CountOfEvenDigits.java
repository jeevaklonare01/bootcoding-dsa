package Java.Array;

import Java.Recursion.Count;

public class CountOfEvenDigits {
    public static void main(String[] args) {
        int a[] = {1234,345,2,6,789965};
        int result = CountEven(a);
        System.out.println(result);

    }
    public static int CountEven(int[] nums) {
        int count = 0;
        for(int i: nums){
            if(Digit(i))
                count++;
        }
        return(count);
    }
    public static boolean Digit(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return(count%2==0);
    }
}
