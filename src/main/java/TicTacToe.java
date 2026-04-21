public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();

        int slot = 5; // test input

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        if (isValidMove(row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }

        printBoard();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}