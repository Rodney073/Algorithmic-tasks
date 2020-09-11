/*
The second biggest
        Create a function called secondBiggest that takes an array of integers as an input, and returns the second biggest number in that array.

        Example case:

        secondBiggest([5, 1, 2, 7, 9, 2, 4]);
        Should return 7.

        --------------------------------
*/
package TasksFromJohnyka;

public class TheSecondBiggest {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 2, 7, 9, 2, 4};
        System.out.println(secondBiggest(numbers));
    }

    private static int secondBiggest(int[] numbers) {

        int container = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    container = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = container;
                }

            }

        }

        return numbers[1];
    }
}
