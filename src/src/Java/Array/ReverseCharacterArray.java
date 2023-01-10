package Java.Array;

public class ReverseCharacterArray {
    public static String[] reverseString(String[] s) {
        int i = 0;
        int j = s.length-1;
        while (i<j) {
            String temp=s[i];
            s[i++]=s[j];
            s[j--]=temp;
        }
        return s;
    }


    public static void printArray( String arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void main(String args[]) {

        String arr[] = {"1", "2", "3", "4", "5"};
        String res[] = reverseString(arr);
        for(int i =0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}


