// - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`
package ArraysTasks;

public class CompareLength {
    public static void main(String[] args) {
        int [] firstArrayOfNumbers= {1,2,3};
        int [] secondArrayOfNumbers= {4,5,6};

        System.out.println(compareLengthOfTwoArrays(firstArrayOfNumbers, secondArrayOfNumbers));
    }

    private static String compareLengthOfTwoArrays(int[] firstArrayOfNumbers, int[] secondArrayOfNumbers) {
        if (firstArrayOfNumbers.length < secondArrayOfNumbers.length) {
            return "secondArrayOfNumbers is longer";
        }
        else if (firstArrayOfNumbers.length > secondArrayOfNumbers.length) {
                return "firstArrayOfNumbers is longer";
            }
        else return "same length";
    }
}
