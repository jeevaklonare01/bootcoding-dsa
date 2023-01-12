package Java.Array;

public class LengthofLastWord {

    public static int lengthOfLastWord(String s){
        s=s.trim();
        int lastSpace = s.lastIndexOf("");
        return s.length() - lastSpace -1;
    }

    public static void main(String[] args) {
        String s ="lorem ipsum";
    }
}
