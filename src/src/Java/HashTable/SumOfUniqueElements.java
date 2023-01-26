package Java.HashTable;

import java.util.HashMap;

public class SumOfUniqueElements
{
    public static void main(String[] args)
    {
        SumOfUniqueElements sum = new SumOfUniqueElements();
        int[] a = {10, 20, 10, 20, 30, 40};
        int result = sum.sumOfUnique(a);
        System.out.println(result);


    }
    public int sumOfUnique(int[] nums) {
        HashMap store = new HashMap();
        for(int i = 0; i<nums.length; i++)
        {
            if(store.containsKey(nums[i]))
            {
              int value = (int) store.get(nums[i]);
              store.put(nums[i], value+1);
            }else
            {
                store.put(nums[i],1);
            }
        }
        int sum=0;
        for(Object key : store.keySet())
        {
         int k = (int) key;
         int value = (int) store.get(k);
         if(value == 1){
             sum=sum+k;
         }
        }
        return sum;
        }

    }
