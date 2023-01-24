package Java.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sum = new SumOfDigits();
        int a=1234567;
        int result = sum.sumDigit(a);
        System.out.println(result);
    }

    public int sumDigit(int n) {
        if (n < 10) {
            return n;
        }
        return n%10 + sumDigit(n / 10);

    }
}

