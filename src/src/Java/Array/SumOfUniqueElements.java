package Java.Array;

import java.util.HashMap;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int a [] = {10,20,10,30,20,40};

        HashMap store = new HashMap();
        for( int i = 0 ; i<a.length; i++){
            if(store.containsKey(a[i])) {
                int value = (int) store.get(a[i]);
                store.put(a[i], value + 1);
            }else{
                store.put(a[i],1);
            }
        }
        int sum=0;
        for(Object key : store.keySet()){
            int k = (int) key;
            int value = (int) store.get(k);
            if(value == 1){
                sum=sum+k;
            }
        }System.out.println(sum);
    }
}


