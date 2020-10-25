public class IsMatrixSymmetric {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrix2 = {
                {1,2,7},
                {2,5,8},
                {7,8,9}
        };

        int[][] matrix3 = {
                {1,2,7,5},
                {2,5,8,4},
                {7,8,9,3}
        };

        System.out.println(isSymmetric(matrix1));
        System.out.println(isSymmetric(matrix2));
        System.out.println(isSymmetric(matrix3));

    }

    public static boolean isSymmetric(int[][] matrix) {

        if (matrix.length != matrix[matrix.length-1].length){
            return false;
        }

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] != matrix [j][i]) {
                    return false;
                }
            }
        }
    return true;
    }

}
