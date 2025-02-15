import java.util.Scanner;

public class App {

    // moved dropStone in to the ConnectFourGame.java section

    public static void printBoard(char[][] board) {
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
        boolean p1ToPlay = true;

        while (true) {
            printBoard(board);

            char token;
            if (p1ToPlay) {
                token = 'O';
            } else {
                token = 'X';
            }
            ConnectFourGame.playTwoPlayerGame(p1ToPlay, token);
            break;
        }
        inputReader.close();
    }
}
