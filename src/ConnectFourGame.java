
public class ConnectFourGame {

    public static void playingOfGame() {
        System.out.println("What would you like to do?");
        System.out.println("1) View Board");
        System.out.println("2) Make a Move");
        System.out.println("3) Exit the Game Early");
        
    }

    public static void playerOneTurn(boolean p1ToPlay) {
        System.out.println("Starting Player 1's turn...");

        p1ToPlay = !p1ToPlay;
    }

    public static void playerTwoTurn(boolean p1ToPlay) {
        System.out.println("Starting Player 2's turn...");

        p1ToPlay = true;
    }

    public static void playTwoPlayer(boolean p1ToPlay) {
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