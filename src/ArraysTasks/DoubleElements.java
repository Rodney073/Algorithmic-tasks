// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
package ArraysTasks;

import java.util.Arrays;

public class DoubleElements {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(doubleElements(numList)));
    }

    private static int[] doubleElements(int[] numList) {
        for (int i = 0; i <numList.length ; i++) {
            numList[i]=numList[i]*2;
        }
        return numList;
    }
}
