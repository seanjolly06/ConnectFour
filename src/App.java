import java.util.Scanner;

public class App {

    public static void dropStone(
            Scanner inputReader,
            char[][] board,
            char tokenToDrop) {
        // this function will be responsible for asking the player
        // to specify which column they want to drop in
        // we have to make sure that column is not already full
        // we can assume that the board is not completely full
        // the reason for that is:
        // this function is being called either for the very first time from
        // main function, OR
        // this function is being called right after the other player placed a stone
        // we always check to make sure that the game is not over AFTER each turn
        // which means if it is not the very first time this function is being called,
        // we would have just checked if the game is over right after the other player
        // placed their last stone
        // since the game is not over, there must be at least one empty space
    }

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
        printBoard(board);

        boolean p1ToPlay = true;
        // player 1 will always have the O token
        // player 2 will always have the X token
        while (true) {
            // decide if it is player 1 to drop a stone or player 2
            // get the appropriate player to drop a stone in a particular column

            // check to see if the game has finished due to the baord being full,
            // if so, get out of the loop
            // if not, flip the turns so the next player plays
            p1ToPlay = !p1ToPlay;
            break;
        }
        inputReader.close();
    }
}
