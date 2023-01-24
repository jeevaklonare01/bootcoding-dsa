package Java.Recursion;

public class Print {
    public static void main(String[] args) {
        Print pr = new Print();
         pr.printAscending(10);
         pr.printDecending(10);
    }
    public void printAscending (int n){
        if(n==0){
            return ;
        }
        printAscending(n-1);
        System.out.println(n);
    }
    public void printDecending(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecending(n-1);
    }
}
