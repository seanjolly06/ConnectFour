import java.util.Scanner;

public class App {

    // I thought about for a while, I have no idea on how to make a win condition.

    public static char[][] printBoard(char[][] board) {
        System.out.println("=============================");
        for (int i = 0; i < 6; i++) {
            // print the current row
            char[] currentRow = board[i];
            System.out.print("|");
            for (int j = 0; j < 7; j++) {
                char currentCharacter = currentRow[j];
                System.out.print(" " + currentCharacter + " |");
            }
            System.out.println();
        }
        System.out.println("=============================");
        System.out.println("  1   2   3   4   5   6   7");

        return board;
    }

    public static char[][] getInitialBoard() {
        char[][] board = {
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
        };
        return board;
    }

    public static void main(String[] args) throws Exception {
        Scanner inputReader = new Scanner(System.in);
        char[][] board = getInitialBoard();

        System.out.println("Would you like to play a game of connect four? y/n");
        String playConnectFour = inputReader.nextLine();
        String playAgain;

        if (playConnectFour.equals("y")) {
            System.out.print("Ok! Booting up Connect Four Simulation...");
            while (true) {
                ConnectFourGame.playTwoPlayerGame(inputReader, board);
                System.out.println("Do you want to play again?");
                inputReader.next();
                playAgain = inputReader.nextLine();
                if (playAgain.equals("y")) {
                    ConnectFourGame.playTwoPlayerGame(inputReader, board);
                } else if (playAgain.equals("n")) {
                    System.out.println("Ok, have a good day!");                   
                    break;
                }
            }
        } else if (playConnectFour.endsWith("n")) {
            System.out.println("Ok, have a good day!");
        } else {
            System.out.println("Invalid option.");
        }
        inputReader.close();
    }
}
