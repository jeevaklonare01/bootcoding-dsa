package Java.Search;

public class kthMissPosNum {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int k = 7;
        int index = findKthPositive(a,k);
        System.out.println(k+" is found at : "+index);

    }
    public static int findKthPositive(int [] a, int k){
        int j=0;

        for(int i:a){
            if(i<=k) k++;
            else break;
        }
        return k;
    }
}

