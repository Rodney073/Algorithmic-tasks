import java.util.Arrays;

public class DoubleIfEven {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.deepToString(doubleIfMethod(matrix)));

    }

    private static int[][] doubleIfMethod(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] % 2 == 0) {
                    matrix[row][col] = matrix[row][col] * 2;
                }
            }
        }
        return matrix;
    }
}
