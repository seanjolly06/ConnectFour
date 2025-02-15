import java.util.Scanner;
import java.util.InputMismatchException;

public class ConnectFourGame {

    private static void dropStone(Scanner inputReader, char tokenToDrop, char[][] board) {
        int column;

        while (true) {
            System.out.println("Where would you like to place your stone? (Column 1-7)");

            try {
                column = inputReader.nextInt() - 1;}
            catch (InputMismatchException e) {
                System.out.println("Please put a column number");
                inputReader.next();
                continue;
            }

            if (column < 0 || column >= 7) {
                System.out.println("Please input a correct column");
                continue;
            }

            for (int row = 5; row >= 0; row--) {
                if (board[row][column] == ' ') {
                    board[row][column] = tokenToDrop;
                    System.out.println("Token " + tokenToDrop + " dropped successfully on " + (column + 1));
                }
            }
            // If it exits the loop then the column is full
            System.out.println("Column full, try again!");
        }
    }

    public static void playTwoPlayerGame(boolean p1ToPlay, Scanner inputReader, char token, char[][] board) {
        System.out.println("Hello Player! You have selected this option to play a two player connect four game.");
        System.out.println("We have defaulted you to the O token.");
        System.out.println("You are going first!");
        boolean playerWin = true;

        while(playerWin) {
            if (p1ToPlay) {
                System.out.println("Starting Player 1's turn...");
                dropStone(inputReader, token, App.printBoard(board));
                p1ToPlay = !p1ToPlay;
            } else if (!p1ToPlay) {
                System.out.println("Starting Player 2's turn...");
                dropStone(inputReader, token, App.printBoard(board));
                p1ToPlay = true;
            } else {
                System.out.println("Something went wrong!");
            }
        }
    }
}