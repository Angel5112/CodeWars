package CountingSheep;

import javax.swing.plaf.IconUIResource;

/**
 * Consider an array/list of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array (true means present).
 * Hint: Don't forget to check for bad values like null/undefined
 */
public class CountingSheep {

    public static int countSheeps(Boolean[] arrayOfSheeps) {

        int len = arrayOfSheeps.length;
        int counter = 0;

        for (int i = 0; i < len; i++){
            if (arrayOfSheeps[i] == null){
                continue;
            } else if (arrayOfSheeps[i]){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args){

        Boolean[] mySheepsArray = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};

        System.out.println(countSheeps(mySheepsArray));
    }
}
