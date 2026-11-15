import java.util.*;

//transpose of a matrix
class File14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // no of rows
        int n = sc.nextInt();
        // no of columns
        int m = sc.nextInt();
        // get n*m array
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // transpose
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
