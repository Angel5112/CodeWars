package DiffArrayExercise;

import java.util.Arrays;

/*
 * DOES NOT WORK ON THE PLATFORM, THE CODE NEEDS SOME REFACTORING, NEXT TIME USE ARRAYLIST CLASS
 */

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b){

        // Create new array with same length as 'a'

        int[] auxArr = new int[a.length - 1];
        int counter = 0;

        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[j] == b[i]){
                    continue;
                } else if (a[j] != b[i]){
                    auxArr[counter] = a[j];
                    counter++;
                }
            }
        }
        return auxArr;
    }

    public static void main(String[] args){
        int[] x = {1, 2};
        int[] y = {2};

        int[] result = arrayDiff(x, y);
        System.out.println(Arrays.toString(result));
    }
}
