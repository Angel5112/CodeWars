package HighestAndLowest;

/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 * @author Angel Eduardo
 */

public class Main {

    public static String highAndLow(String numbers){
        int highest = -9999999;
        int lowest = 9999999;

        String[] numsArray = numbers.split(" ");

        for (int i = 0; i < numsArray.length; i++){
            int num = Integer.parseInt(numsArray[i]);

            if (num >= highest){
                highest = num;
            } else if (num <= lowest){
                lowest = num;
            }
        }

        return highest + " " + lowest;
    }

    public static void main(String[] args){
        String solution = highAndLow("3 5 -1 24 2");
        System.out.println("The highest and lowest numbers of the sequence are: " + solution);
    }
}
