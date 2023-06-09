package OrderPlease;

/*
Your task is to sort a given string. Each word in the string will contain a single number.
This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only
contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
*/

public class OrderPlease {

    public static int findOrder(String word){
        for (int i = 0; i < word.length(); i++){
            if (Character.isDigit(word.charAt(i))){
                return Integer.parseInt(Character.toString(word.charAt(i)));
            }
        }

        return -1;
    }

    public static String order(String words) {

        if (words.length() == 0){
            return words;
        } else {
            String[] wordsArr = words.split(" ");
            String[] newString = new String[wordsArr.length];

            for (int i = 0; i < wordsArr.length; i++){
                int position = findOrder(wordsArr[i]);
                if (position != -1){
                    newString[position - 1] = wordsArr[i];
                }
            }

            return String.join(" ", newString);

        }
    }

    public static void main(String[] args){
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
