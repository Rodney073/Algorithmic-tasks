// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print the third element of `numbers`

package ArraysTasks;

import java.util.Arrays;
import java.util.List;

public class Third {


    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        System.out.println(getTheThird(numbers));
        //OR
        System.out.println(numbers[2]);
    }

    private static Integer getTheThird(Integer[] numbers) {
        List<Integer> list = Arrays.asList(numbers);
        return list.get(2);
    }
}
