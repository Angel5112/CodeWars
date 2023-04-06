package PlayingBanjo;

/**
 * Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 * The function takes a name as its only argument, and returns one of the following strings:
 * name + " plays banjo"
 * name + " does not play banjo"
 */

public class PlayingBanjo {

    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'r' || name.charAt(0) == 'R'){
            return name + " plays banjo";
        } else  {
            return name + " does not play banjo";
        }
    }

    public static void main(String[] args){

        String myName = "Benji";
        System.out.println(areYouPlayingBanjo(myName));
    }
}
