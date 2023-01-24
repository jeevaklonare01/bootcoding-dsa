package Java.Recursion;

public class Power {
    public static void main(String[] args) {
        Power pow = new Power();
        int a = pow.printPower(2,3);
        System.out.println(a);
    }
    public int printPower(int n, int m){
        if(m==0){
            return 1;
        }
       return n*printPower(n,m-1);
    }
}
