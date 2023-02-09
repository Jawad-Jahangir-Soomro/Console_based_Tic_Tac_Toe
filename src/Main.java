import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe game:");


        TicTacToe.printBoard();

        while (true) {
            System.out.print("Enter row and column (e.g. 1 2): ");

            Scanner sc = new Scanner(System.in);

            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            sc.nextLine();

            if (TicTacToe.board[row][col] == ' ') {
                TicTacToe.board[row][col] = TicTacToe.turn % 2 == 0 ? 'X' : 'O';
                TicTacToe.turn++;
                TicTacToe.printBoard();

                if (TicTacToe.checkWin('X')) {
                    System.out.println("X wins!");
                    break;
                } else if (TicTacToe.checkWin('O')) {
                    System.out.println("O wins!");
                    break;
                } else if (TicTacToe.turn == 9) {
                    System.out.println("It's a draw!");
                    break;
                }
            } else {
                System.out.println("This cell is already occupied, try again.");
            }
        }
    }
}