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
        System.out.println(Arrays.deepToString(setRowIfContainsZero(matrix)));
    }

    private static int[][] setRowIfContainsZero(int[][] matrix) {

        List<Integer> listOfColumnNums = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    Arrays.fill(matrix[i], 0);
                    listOfColumnNums.add(j);
                    break;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (listOfColumnNums.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
