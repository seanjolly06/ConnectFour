import java.util.Scanner;
import java.util.InputMismatchException;

public class ConnectFourGame {

    public static void dropStone(Scanner inputReader, char tokenToDrop, char[][] board) {
        int column;

        while (true) {
            System.out.print("Where would you like to place your stone? (Column 1-7) ");

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
                    System.out.println("Token " + tokenToDrop + " dropped successfully on column " + (column + 1));
                    return;
                }
            }
            System.out.println("Column full, try again!");
        }
    }

    public static void playTwoPlayerGame(Scanner inputReader, char[][] board) {
        System.out.println("Hello Player! You have selected this option to play a two player connect four game.");
        System.out.println("We have defaulted you to the o token.");
        System.out.println("You are going first!");
        boolean p1ToPlay = true;
        
        while(true) {
            char token;
            if (p1ToPlay) {
                token = 'o';
                System.out.println("Player 1's Turn (o)");
            } else {
                token = 'x';
                System.out.println("Player 2's Turn (x)");
            }

            dropStone(inputReader, token, board);

            App.printBoard(board);

            // Win Condition soon...

            p1ToPlay = !p1ToPlay;
        }
    }
}