public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        printBoard();

        makeMove(1, 1, 'X'); // test move
        printBoard();
    }

    static boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            return board[row][col] == '-';
        }
        return false;
    }

    static void makeMove(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
        } else {
            System.out.println("Invalid Move");
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}