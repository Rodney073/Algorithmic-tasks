/*Rotate elements
        Create a function called rotateElements that

        takes an array of integers (array) and an integer (rotations) as an input,
        applies rotations number of left shifts on the elements of the given array,
        returns the result array after all the rotations
        Example cases:

        rotateElements([1, 2, 3], 1);
        Should return [2, 3, 1], because it shifts all elements 1 to the left, so the leftmost element rotates to the last position.

        rotateElements([1, 2, 3], 2);
        Should return [3, 1, 2], because it shifts all elements 2 to the left, rotating the leftmost elements to the last positions.

        --------------------------------*/
package TasksFromJohnyka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateElements {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 5};
        Scanner input = new Scanner(System.in);

        System.out.println("Let's shift this array: {1, 2, 3, 4, 5} to the left with: ");
        int shift = input.nextInt();

        while (shift < 0) {
            System.out.println("Please type a positive number");
            shift = input.nextInt();
        }

        System.out.println(Arrays.toString(rotateElements(array, shift)));
        //System.out.println(Arrays.toString(rotateElements2(array2, shift)));
        //System.out.println(Arrays.toString(rotateElements3(array3, shift)));
    }

    private static int[] rotateElements(int[] array, int shift) {

        int container = 0;
        for (int i = 0; i < shift; i++) {
            container = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = container;
        }
        return array;

    }



   /* private static int[] rotateElements(int[] array, int input) {


        List<Integer> containerList = new ArrayList<>();

        if (input > array.length) {
            input = Math.floorMod(input, array.length);
        }


        for (int i = 0; i < input; i++) {
            containerList.add(array[i]);
        }

        for (int i = 0; i < array.length - input; i++) {
            array[i] = array[i + input];
        }

        for (int i = 0; i < containerList.size(); i++) {
            array[array.length - input + i] = containerList.get(i);
        }

        return array;
    }

    private static int[] rotateElements2(int[] array, int input) {

        for (int i = 0; i < input; i++) {

            int first = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = first;

        }
        return array;
    }


    private static int[] rotateElements3(int[] array, int input) {

        for (int i = 0; i < input; i++) {

            int first = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = first;
        }
        return array;
    }
*/
}
