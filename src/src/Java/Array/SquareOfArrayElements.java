package Java.Array;
//write a program to return square of array elements using method.
public class SquareOfArrayElements {
    public  int[] squareOfArrayElements(int [] num){
        int squares =0;
        int a[]=new int[num.length];
        for(int i=0 ; i<num.length; i++) {
            a[i] = num[i] * num[i];
        }
        return a;
    }

    public static void main(String[] args) {
        SquareOfArrayElements sq = new SquareOfArrayElements();
        int b[]={1,2,3,4,5};
        int result[]=sq.squareOfArrayElements(b);
        for(int i =0; i< result.length;i++){
            System.out.println(result[i]);
        }


    }}
