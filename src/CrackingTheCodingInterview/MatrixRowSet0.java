/*Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
        column is set to 0.*/

package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixRowSet0 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 0, 5},
                {2, 8, 3, 7, 8},
                {8, 3, 7, 9, 8},
                {7, 0, 5, 5, 6},
                {4, 2, 4, 4, 3}
        };
        System.out.println(Arrays.deepToString(setRowAndColIfContainsZero(matrix)));
    }

    private static int[][] setRowAndColIfContainsZero(int[][] matrix) {

        List<Integer> listOfColumnNums = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) {
                    Arrays.fill(matrix[row], 0);
                    listOfColumnNums.add(col);
                    break;
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (listOfColumnNums.contains(col)) {
                    matrix[row][col] = 0;
                }
            }
        }
        return matrix;
    }
}
