package Java.Recursion;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo pw =new PowerOfTwo();
        int a = 16;
        boolean result =pw.isPowerOfTwo(a);
        System.out.println(result);
    }
}
