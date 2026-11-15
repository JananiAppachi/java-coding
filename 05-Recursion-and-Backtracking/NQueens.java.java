import java.util.*;

public class Backtracking_n_Queens {

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> row = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String temp = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    temp += 'Q';
                } else {
                    temp += '.';
                }
            }
            row.add(temp);
        }
        allBoards.add(row);
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // horizontal

        for (int r = row, c = 0; c < board.length; c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // vertical

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // upper left

        for (int r = row, c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // upper right

        for (int r = row, c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left

        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower right

        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col) {

        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }

    }

    public static List<List<String>> findNQueens(int n) {

        char[][] board = new char[n][n];
        List<List<String>> allBoards = new ArrayList<>();
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        System.out.println(findNQueens(4));
    }

}
