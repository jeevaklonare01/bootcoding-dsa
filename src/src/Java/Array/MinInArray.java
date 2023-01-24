package Java.Array;

public class MinInArray {
    public static void main(String[] args) {
        MinInArray mn = new MinInArray();
        int array[] = {1,2,3,4,5,6};
        int result = mn.minInArray(array);
        System.out.println(result);

    }
    public int minInArray(int[] numbers){
        int min = numbers[0];
        for (int i=1; i<numbers.length; i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;
    }
}


