// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element
// - Print the third element
package ArraysTasks;

import java.util.Arrays;

public class IncrementElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(incrementThirdElement(numbers)));
    }

    private static int[] incrementThirdElement(int[] numbers) {
        numbers[2]+=1;
        return numbers;
    }
}
