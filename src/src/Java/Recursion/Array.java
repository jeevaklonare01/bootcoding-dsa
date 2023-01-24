package Java.Recursion;

public class Array {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        printArray(a,0);
    }
    public static void printArray(int [] num, int i) {
        if(i==num.length){
            return;
        }
        System.out.println(num[i]);
        printArray(num,++i);

    }
}
