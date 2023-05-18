package SentenceSmash;

/**
 * Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
 * You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
 * Be careful, there shouldn't be a space at the beginning or the end of the sentence!
 */
public class SentenceSmash {

    public static String smash(String... words) {

        // CAN BE SOLVED WITH: return String.join(" ", words);

        int len = words.length;
        String smashedString = "";

        for (int i = 0; i < len; i++){
            smashedString += words[i] + " ";
        }
        return smashedString.stripTrailing();       // stripTrailing() removes the last whitespace found before the /n character
    }

    public static void main(String[] args){

        String[] wordsArray = {"Hello", "my", "name", "is", "Angel"};
        System.out.println(smash(wordsArray));
    }
}
