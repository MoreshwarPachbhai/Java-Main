
// Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.


package Arrays;
import java.util.*;
public class SetMatrixZero {

    public static void setzeros(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean [] row = new boolean[rows];
        boolean [] col = new boolean[cols];

        // Step 1: Find all zeros
        for(int i =0; i < rows; i++){
            for(int j=0; j < cols; j++){
                if(matrix[i][j] == 0){
                    row[i] = true; // mark that row
                    col[j] = true; // mark that column
                }
            }
        }

        // Step 2: Set rows to zero
        for(int i=0; i < rows; i++){
            if(row[i] == true){
                for(int j =0; j < cols; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set columns to zero
        for(int j=0; j < cols; j++){
            if(col[j] == true){
                for(int i =0; i < rows; i++){
                    matrix[i][j] = 0;
                }
            }
        }


    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        setzeros(matrix);


        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
