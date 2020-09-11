// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
package ArraysTasks;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Mekkora legyen a matrix?");
        int sizeOfMatrix = input.nextInt();

        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
