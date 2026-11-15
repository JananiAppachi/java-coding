public class Sudoko_Solver {

    public static void display(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValid(char[][] a, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (a[row][i] == c) {
                return false;
            }
            if (a[i][col] == c) {
                return false;
            }
            if (a[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                return false;
            }
        }
        return true;
    }

    public static boolean sudokoFunction(char[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(a, i, j, c)) {
                            a[i][j] = c;
                            if (sudokoFunction(a) == true) {
                                return true;
                            } else {
                                a[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        display(a);
        return true;

    }

    public static void main(String[] args) {
        char[][] a = {
                { '5', '3', '.', '6', '7', '8', '9', '.', '2' }, { '6', '7', '2', '1', '9', '5', '3', '4', '8' },
                { '.', '9', '8', '3', '4', '2', '5', '6', '7' }, { '8', '5', '9', '7', '6', '1', '4', '2', '3' },
                { '4', '2', '6', '8', '5', '3', '7', '9', '1' }, { '7', '1', '3', '9', '.', '4', '8', '.', '6' },
                { '9', '6', '.', '5', '3', '7', '2', '8', '4' }, { '2', '8', '7', '4', '1', '9', '6', '3', '5' },
                { '3', '4', '5', '2', '8', '6', '1', '7', '9' }
        };

        sudokoFunction(a);
    }

}
