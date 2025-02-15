import java.util.Scanner;
import java.util.InputMismatchException;

public class ConnectFourGame {

    private static void dropStone(Scanner inputReader, char token) {
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


            if () {
                System.out.println("Spot confirmed! The token you dropped was: " + token);
            } else if () {
                System.out.println("Sorry that column is full! Try again!");
                continue;
            } else {
                System.out.println("That column doesn't exist!");
                continue;
            }
        }
    }

    public static void playingOfGame(boolean p1ToPlay, char token, Scanner inputReader) {
        if (p1ToPlay) {
            token = 'O';
        } else {
            token = 'X';
        }
        dropStone(null, token);
    }

    public static void playerOneTurn(boolean p1ToPlay) {
        System.out.println("Starting Player 1's turn...");
        playingOfGame(p1ToPlay, 'O', null);
        p1ToPlay = !p1ToPlay;
    }

    public static void playerTwoTurn(boolean p1ToPlay) {
        System.out.println("Starting Player 2's turn...");
        playingOfGame(!p1ToPlay, 'X', null);
        p1ToPlay = true;
    }

    public static void playTwoPlayerGame(boolean p1ToPlay) {
        System.out.println("Hello Player! You have selected this option to play a two player connect four game.");
        System.out.println("We have defaulted you to the O token.");
        System.out.println("You are going first!");
        boolean playerWin = false;

        while(playerWin) {
            if (p1ToPlay) {
                playerOneTurn(true);
            } else if (!p1ToPlay) {
                playerTwoTurn(false);
            } else {
                System.out.println("Something went wrong!");
            }
        }
    }
}