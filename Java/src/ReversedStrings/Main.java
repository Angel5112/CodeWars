package ReversedStrings;

/**
 * Reverse the given string
 * @author Angel Eduardo
 */

public class Main {

    public static String solution(String str){
        String reversedString = "";
        int strLength = str.length();

        if (strLength == 0){
            return reversedString;
        } else {
            int i = strLength - 1;
            char aux;

            while (i > -1){
                aux = str.charAt(i);
                reversedString += aux;
                i--;
            }

            return reversedString;
        }
    }

    public static void main(String[] args){
        String result = solution("Hola");
        System.out.println(result);
    }
}
