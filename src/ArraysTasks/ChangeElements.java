// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element
package ArraysTasks;

import java.util.Arrays;

public class ChangeElements {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 8, 5, 6};
        System.out.println(Arrays.toString(changeEightToFour(numbers)));
    }

    private static int[] changeEightToFour(int [] numbers) {

        for (int i = 0; i <numbers.length ; i++)
            if (numbers[i] == 8) {
                numbers[i] = 4;
            }

        return numbers;
    }
}
