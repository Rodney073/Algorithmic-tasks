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
        Scanner input = new Scanner(System.in);

        System.out.println("Let's shift this array: {1, 2, 3, 4, 5} to the left with: ");
        int shift = input.nextInt();

        while (shift < 0) {
            System.out.println("Please type a positive number");
            shift = input.nextInt();
        }

        System.out.println(Arrays.toString(rotateElements(array, shift)));
    }

    private static int[] rotateElements(int[] array, int input) {


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

}
