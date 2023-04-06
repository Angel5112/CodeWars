package YesOrNo;

/**
 * Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
 */
public class YesOrNo {

    public static String boolToWord(boolean b) {
        if (b){
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args){
        String result = boolToWord(true);
        System.out.println(result);
    }
}
