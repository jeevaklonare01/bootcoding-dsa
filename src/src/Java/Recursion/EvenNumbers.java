package Java.Recursion;

public class EvenNumbers {
    public static void main(String[] args) {
        EvenNumbers eve = new EvenNumbers();
        eve.EvenNo(10);
    }

    public void EvenNo (int n){
        if(n==0){     //base condition
            return ;
        }
        EvenNo(n-1);
        if(n%2==0){    //logic
            System.out.println(n);
        }
    }
}
