package Java.Array;

public class NoOfPositiveAndNegativeIntegers
{
    public static int maximumCount(int[] nums) {
        int poscount=0;
        int negcount=0;
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]>0){
                poscount++;
            }
            else if(nums[i] < 0){
                negcount++;
            }
        }
        if(poscount>negcount){
            return poscount;
        }
        else{
            return negcount;     }

    }

    public static void main(String[] args) {
        int a[]= {1,2,3,5,-4,-5,-6,0};
        int result = maximumCount(a);
        System.out.println(result);
    }}



