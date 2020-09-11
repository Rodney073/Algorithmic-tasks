/*Remove duplicates
        Create a function called removeDuplicates that

        takes an array of integers (array) as an input,
        returns a result array / list where all the elements are unique
        Example cases:

        removeDuplicates([1, 1, 2, 2, 3]);
        Should return [1, 2, 3]

        removeDuplicates([1, 2, 3]);
        Should return [1, 2, 3]

        removeDuplicates([]);
        Should return []

        --------------------------------*/
package TasksFromJohnyka;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6, 6, 6};
        System.out.println((returnDuplicate(numbers)));
    }

    private static List<Integer> returnDuplicate(int[] numbers) {

        List<Integer> intList = new ArrayList<Integer>();
        for (int i : numbers) {
            intList.add(i);
        }

        for (int i = 0; i < intList.size(); i++) {
            for (int j = i + 1; j < intList.size(); j++) {
                if (intList.get(i).equals(intList.get(j))) {
                    intList.remove(j);
                    i = 0;
                    j = 0;
                }
            }
        }

        return intList;
    }



}
