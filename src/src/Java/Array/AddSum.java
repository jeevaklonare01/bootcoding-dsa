package Java.Array;

public class AddSum {
    public static void main(String[] args) {
        int a = 25;
        AddSum ad = new AddSum();
        int result = ad.addDigits(a);
        System.out.println(result);
    }
    public int addDigits(int num) {
    while (num >= 10){
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        num = sum;
    }
          return num;
}
}
