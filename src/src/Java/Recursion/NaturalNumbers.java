package Java.Recursion;

public class NaturalNumbers {
    public static void main(String[] args) {
        NaturalNumbers nn = new NaturalNumbers();
        nn.NaturalNum(50);
    }
    public void NaturalNum(int n){
        if(n==0)
        {
            return;
        }
        NaturalNum(n-1);
        System.out.println(n);
        }
}
