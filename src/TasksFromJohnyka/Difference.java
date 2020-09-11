/*Difference
        Create a function called difference that

        takes 2 arrays of integers (array1) and (array2) as an input,
        returns the difference of the 2 arrays(Those elements that are present array1 but not present in array2).
        Example cases:

        difference([1, 2, 3], [2, 3, 4]);
        Should return [1]

        difference([1, 2], [3, 4]);
        Should return [1, 2]

        difference([], []);
        Should return []*/
package TasksFromJohnyka;

import java.util.ArrayList;
import java.util.List;

public class Difference {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        System.out.println((difference(array1, array2)));
    }

    private static List<Integer> difference(int[] array1, int[] array2) {
        List<Integer> listOfDiffs = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            int countMatches = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    countMatches++;
                }

            }
            if (countMatches == 0) {
                listOfDiffs.add(array1[i]);
            }
        }

        return listOfDiffs;
    }
}
