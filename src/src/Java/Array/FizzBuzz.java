package Java.Array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static List<String> fizzBuzz(int n){
    List<String> a = new ArrayList();
    for(int i =0; i<=n;i++){
        if(i% 3==0 && i% 5 ==0){
            a.add("FizzBuzz");
        } else if (i% 3 ==0 ) {
            a.add("Fizz");
        } else if (i % 5 == 0) {
            a.add("Buzz");
        }else{
            a.add(""+i);                }
    }
    return a;
}
    public static void main(String[] args) {
        int a = 15;
        List<String> result = fizzBuzz(a);
        System.out.println(result);
}}
