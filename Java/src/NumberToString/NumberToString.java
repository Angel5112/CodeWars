package NumberToString;

/**
 * Write a function that transforms an Integer to a String
 */
public class NumberToString {

    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    public static void main(String[] args){

        int myNum = 564564;
        System.out.println(numberToString(myNum));
    }
}
