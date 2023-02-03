package Java.Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {50, 25, 100, 3, 39};
        int[] result = insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int i = j - 1;
            while ((i > -1) && (array[i] > array[j])) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = array[j];
        }
        return array;
    }
}
