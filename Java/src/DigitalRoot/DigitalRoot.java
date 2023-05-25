package DigitalRoot;

/**
 * Digital root is the recursive sum of all the digits in a number.
 *
 * Given n, take the sum of the digits of n.
 * If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
 * The input will be a non-negative integer.
 */

public class DigitalRoot {

    public static int digital_root(int n) {
        String auxNum = Integer.toString(n);
        int digitalRoot = 0;
        boolean validDigitalRoot = false;

        while (!validDigitalRoot){
            if (auxNum.length() == 1){
                validDigitalRoot = true;
            } else {
                digitalRoot = 0;
                for (int i = 0; i < auxNum.length(); i++){
                    digitalRoot += Integer.parseInt(Character.toString(auxNum.charAt(i)));
                }

                auxNum = Integer.toString(digitalRoot);
            }
        }

        return digitalRoot;
    }

    public static void main(String[] args){
        System.out.println(digital_root(16));
    }
}
