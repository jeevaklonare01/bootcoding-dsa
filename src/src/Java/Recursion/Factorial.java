package Java.Recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int a=5;
        int result =fact.printFactorial(a);
        System.out.println(result);
    }
    public int printFactorial(int n){
        if(n==1){
            return 1;
        }
        return n * printFactorial(n -1);
    }
}
