// - Create an array variable named `numbers`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element
package ArraysTasks;

public class SumElements {
    public static void main(String[] args) {
        int [] numbers = {54, 23, 66, 12};
        System.out.println(printTheSumOfTheSecondAndThirdElement(numbers));
    }

    private static int printTheSumOfTheSecondAndThirdElement(int [] numbers) {
        int sum =0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
