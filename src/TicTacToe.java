import java.util.Scanner;

public class TicTacToe {
    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameEnded = false;

        printBoard();

        while (!gameEnded) {
            System.out.println("Player " + currentPlayer + ", enter position (1-9): ");
            int position = sc.nextInt();

            if (position < 1 || position > 9 || board[position - 1] != ' ') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[position - 1] = currentPlayer;
            printBoard();

            if (checkWinner()) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull()) {
                System.out.println("It's a draw!");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        sc.close();
    }

    public static void printBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(" " + board[i] + " ");
            if ((i + 1) % 3 != 0)
                System.out.print("|");
            else if (i != 8)
                System.out.println("\n---|---|---");
        }
        System.out.println("\n");
    }

    public static boolean checkWinner() {
        int[][] winPositions = {
                {0,1,2}, {3,4,5}, {6,7,8},
                {0,3,6}, {1,4,7}, {2,5,8},
                {0,4,8}, {2,4,6}
        };

        for (int[] pos : winPositions) {
            if (board[pos[0]] != ' ' &&
                    board[pos[0]] == board[pos[1]] &&
                    board[pos[1]] == board[pos[2]]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBoardFull() {
        for (char c : board) {
            if (c == ' ')
                return false;
        }
        return true;
    }
}