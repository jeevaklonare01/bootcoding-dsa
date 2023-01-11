package Java.Array;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }
        digits = new int[digits.length+1];
        digits[0] =1;
        return digits;
}

    public static void main(String[] args) {
       int a[] = {1,2,9};
        int result[] = plusOne(a);
        for(int i=0; i< result.length;i++) {
            System.out.println(result);
        }
    }
}
