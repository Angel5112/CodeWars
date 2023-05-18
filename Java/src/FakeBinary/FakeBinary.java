package FakeBinary;

/**
 * Given a string of digits, you should replace any digit below 5 with '0'
 * and any digit 5 and above with '1'. Return the resulting string.
 */

public class FakeBinary {

    public static String fakeBin(String numberString) {

        int len = numberString.length();
        String fakeBinary = "";

        for (int i = 0; i < len; i++){
            int charInt = Integer.parseInt(String.valueOf(numberString.charAt(i)));     // With numberString.charAt(i) < 5 was enough!!
            if (charInt < 5){
                fakeBinary += '0';
            } else {
                fakeBinary += '1';
            }
        }

        return fakeBinary;
    }

    public static void main(String[] args){

        String myIntString = "427";
        System.out.println(fakeBin(myIntString));
    }
}
