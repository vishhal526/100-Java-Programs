
import java.util.*;

public class Matrix_Mul {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int row;
        int col;
        int newrow;

        System.out.print("Enter the dimensions of 1st Matrix \n");
        System.out.print("Enter the rows = ");
        row = s.nextInt();
        System.out.print("Enter the columns = ");
        col = s.nextInt();
        newrow = col;

        int[][] mat1 = matrix(row, col);

        System.out.print("Enter the dimensions of 2nd Matrix \n");
        System.out.print("Enter the rows = ");
        row = s.nextInt();
        System.out.print("Enter the columns = ");
        col = s.nextInt();

        int[][] mat2 = matrix(row, col);

        col = row;

        int[][] ans = new int[newrow][col];

        for (int i = 0; i < newrow; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col; k++) {
                    ans[i][j] = ans[i][j] + (mat1[i][k] * mat2[k][j]);
                }
            }
        }

        System.out.println("Answer Matrix = ");

        for (int i = 0; i < newrow; i++) {
            for (int j = 0; j < newrow; j++) {
                System.err.print(ans[i][j] + " ");
            }
            System.err.print("\n");
        }

        s.close();

    }

    public static int[][] matrix(int a, int b) {
        Scanner s = new Scanner(System.in);
        int[][] mat = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Enter " + (i + 1) + "" + (j + 1) + " element = ");
                mat[i][j] = s.nextInt();
            }
        }
        return mat;
    }
}
