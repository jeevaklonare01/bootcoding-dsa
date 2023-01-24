package Java.Recursion;

public class SumOfNaturalNos {
    public static void main(String[] args) {
        SumOfNaturalNos son = new SumOfNaturalNos();

    }
    public int sumOfNos(int n)
    {
        if (n==1) {
            return 1;
        }
        return n + sumOfNos(n - 1);
    }
}
