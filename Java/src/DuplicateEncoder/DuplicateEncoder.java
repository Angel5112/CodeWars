package DuplicateEncoder;

/*
The goal of this exercise is to convert a string to a new string where each character in the
new string is "(" if that character appears only once in the original string, or ")" if that
character appears more than once in the original string. Ignore capitalization when determining if a character
is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
Notes
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX",
the "XXX" is the expected result, not the input!
 */

public class DuplicateEncoder {

    public static int searchOcurrences(char word, String text){
        int counter = 0;

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == word){
                counter++;
            }
        }

        return counter;
    }


    public static String encode(String word){
        String encodedString = "";
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++){
            if (searchOcurrences(word.charAt(i), word) == 1){
                encodedString += "(";
            } else {
                encodedString += ")";
            }
        }

        return encodedString;
    }


    public static void main(String[] args){
        System.out.println(encode("(( @"));
    }
}
