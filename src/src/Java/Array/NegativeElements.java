package Java.Array;

public class NegativeElements {
    public int[] negElements(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0 ; i<nums.length; i++) {
           if(nums[i]<0){
               a[i]=nums[i];
           }
        }
        return a;
    }

    public static void main(String[] args) {
        NegativeElements ng = new NegativeElements();
        int a[] = {10,-3,20,-40};
        int result [] =ng.negElements(a);
        for(int i =0; i<result.length;i++){
        System.out.println(result[i]);
    }}}
