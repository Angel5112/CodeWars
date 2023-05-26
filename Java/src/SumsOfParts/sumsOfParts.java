package SumsOfParts;

import java.util.ArrayList;

/**
 * Let us consider this example (array written in general format):
 *
 * ls = [0, 1, 3, 6, 10]
 *
 * Its following parts:
 *
 * ls = [0, 1, 3, 6, 10]
 * ls = [1, 3, 6, 10]
 * ls = [3, 6, 10]
 * ls = [6, 10]
 * ls = [10]
 * ls = []
 * The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]
 *
 * The function parts_sums (or its variants in other languages)
 * will take as parameter a list ls and return a list of the sums of its parts as defined above.
 */

public class sumsOfParts {

    public static int[] sumParts(int[] ls){
        ArrayList<Integer> newLs = new ArrayList<>();
        int count = 0;
        int length = ls.length;

        for (int i = 0; i < length; i++){       // Cloning ls elements into newLs
            newLs.add(ls[i]);
        }

        int[] sumsArr = new int[length + 1];    // New array to store the sums

        while (count < length){         // Loop for the sum
            int sums = 0;

            for (int i = 0; i < newLs.size(); i++){
                sums += newLs.get(i);
            }

            if (!newLs.isEmpty()){          // Condition to consider an isEmpty() scenario
                sumsArr[count] = sums;
                count++;
                newLs.remove(0);
            }
        }

        return sumsArr;
    }

    public static void main(String[] args){

        int[] arr = {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358};
        arr = sumParts(arr);

        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
