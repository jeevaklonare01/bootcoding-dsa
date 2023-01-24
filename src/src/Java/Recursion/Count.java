package Java.Recursion;

public class Count {
    public static void main(String[] args) {
    Count count = new Count();
        int a=1234567;
        int result = count.countDigit(a);
        System.out.println(result);
    }

    public int countDigit(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + countDigit(n / 10);

    }
}
