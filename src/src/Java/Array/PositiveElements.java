package Java.Array;

public class PositiveElements {
    public int[] posElements(int[] nums) {
    int a[]=new int[nums.length];
    for(int i=0 ; i<nums.length; i++) {
        if(nums[i]>0){
            a[i]=nums[i];
        }
    }
    return a;
}

    public static void main(String[] args) {
       PositiveElements pos = new PositiveElements();
        int a[] = {10,-3,20,-40};
        int result [] =pos.posElements(a);
        for(int i =0; i<result.length;i++){
            System.out.println(result[i]);
        }}
}
