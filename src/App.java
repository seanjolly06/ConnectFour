public class App {

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
        char[][] board = getInitialBoard();
        printBoard(board);
    }
}
