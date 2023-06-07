package StringToCamelCase;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

public class StringToCamelCase {

    static String toCamelCase(String s){

        if (s.length() == 0){
            return s;
        } else {
            String camelCaseString = "";
            camelCaseString += Character.toString(s.charAt(0));

            for (int i = 1; i < s.length(); i++){
                String auxChar = Character.toString(s.charAt(i));
                if (!auxChar.equals("_") && !auxChar.equals("-")){
                    String validateUpperCase = Character.toString(s.charAt(i - 1));
                    if (validateUpperCase.equals("_") || validateUpperCase.equals("-")){
                        camelCaseString += auxChar.toUpperCase();
                    } else {
                        camelCaseString += auxChar;
                    }
                }
            }

            return camelCaseString;
        }
    }

    public static void main(String[] args){
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }
}
