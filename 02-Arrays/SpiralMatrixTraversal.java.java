import java.util.*;

public class File13 {
    public static void main(String[] args) {
        // printing spiral matrix in 2D matrix
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int srow = 0;
        int erow = m - 1;
        int scol = 0;
        int ecol = n - 1;
        while (srow <= erow && scol <= ecol) {
            // top
            for (int j = scol; j <= ecol; j++) {
                System.out.print(arr[srow][j] + " ");
            }
            // right
            for (int i = srow + 1; i <= erow; i++) {
                System.out.print(arr[i][ecol] + " ");
            }
            // down
            for (int j = ecol - 1; j >= scol; j--) {
                if (srow == erow) {
                    break;
                }
                System.out.print(arr[erow][j] + " ");
            }
            // left
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol) {
                    break;
                }
                System.out.print(arr[i][scol] + " ");
            }
            srow++;
            ecol--;
            erow--;
            scol++;

        }
    }
}
