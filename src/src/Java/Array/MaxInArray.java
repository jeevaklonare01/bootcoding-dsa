package Java.Array;

public class MaxInArray {
    public static void main(String[] args) {
    MaxInArray mx = new MaxInArray();
    int array[] ={1,2,3,4,5,6};
    int result = mx.maxInArray(array);
        System.out.println(result);
    }
    public int maxInArray(int[] numbers){
        int max= numbers[0];
        for (int i=1; i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }
}
