// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`
package ArraysTasks;

import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        
        int[] numbers = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(reverseList(numbers)));
    }

    private static int[] reverseList(int[] numbers) {

        int [] reversedNumbers = new int [numbers.length];

        for (int i = 0; i < numbers.length ; i++) {
            reversedNumbers[i] = numbers[numbers.length-1-i];
        }
        return reversedNumbers;
    }
}
