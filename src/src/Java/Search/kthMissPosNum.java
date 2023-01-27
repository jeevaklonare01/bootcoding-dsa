package Java.Search;

public class kthMissPosNum {
    public static void main(String[] args) {

    }
    public int findKthPositive(int[] A, int x, int left, int right) {
         right= A.length, ;
        while (l < r) {
            m = (l + r) / 2;
            if (A[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }
