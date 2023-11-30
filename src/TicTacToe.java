import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {

    public static int[][] gameGrid = {
            {0, 036}, {0, 04},   {0, 057},
            {0, 13},  {0, 1467}, {0, 15},
            {0, 237}, {0, 24},   {0, 256}
    };

    public static int[][] playerScore = {
            {0, 0, 0}, {1, 0, 0}, {2, 0, 0}, {3, 0, 0}, {4, 0, 0}, {5, 0, 0}, {6, 0, 0}, {7, 0, 0}
    };

    public static void main(String[] args) {

        print("Welcome to TicTacToe! Start a game? Y/N");

        Scanner scan = new Scanner(System.in);

        boolean tryAgain = true;

        while(tryAgain) {

            String startGame = scan.next().toLowerCase();

            switch(startGame) {
                case "y":
                    print("Awesome! Let's get started.");
                    tryAgain = false;
                    initGame();
                    break;
                case "n":
                    print("Party pooper ):");
                    tryAgain = false;
                    break;
                default:
                    print("Not a valid response, please try again.");
            }
        }
        scan.close();
    }

    public static boolean gameOver = false;

    public static void initGame() {
        while(!gameOver) {
            initTurn("X", 1);
            if(gameOver) { break; }
            initTurn("O", 2);
        }
    }

    public static void initTurn(String symbol, int player) {

        print("");
        updateGrid();

        print("Its Player " + player + "'s " + "(" + symbol + ")" + " turn!");

        Scanner scan = new Scanner(System.in);

        boolean turnOver = false;

        int playerInput = 0;

        while(!turnOver) {
            playerInput = Integer.parseInt(scan.next()) - 1;

            if (gameGrid[playerInput][0] == 0) {
                gameGrid[playerInput][0] = player;
                turnOver = true;
            } else {
                print("Space already occupied! Try again.");
            }
        }
        updatePlayerScore(playerInput, player);
    }

    public static void updatePlayerScore(int playerInput, int player) {

        // I broke this method somehow i dont know whats going on god save me

        String currentSpace = String.valueOf(gameGrid[playerInput][1]);

        for(int loop = 0; loop < playerScore.length; loop++) {

            String currentScore = String.valueOf(playerScore[loop][0]);

            boolean containsChar = false;

            containsChar = currentSpace.contains(currentScore);

            if(containsChar) {
                int combinationsInt = playerScore[loop][player];

                playerScore[loop][player] = combinationsInt + 1;
            }
        }

        for(int loop = 0; loop < playerScore.length; loop++) {
            String IDontFuckingKnowAnymore = String.valueOf(playerScore[loop][player]);

            boolean containsChar = IDontFuckingKnowAnymore.contains("3");
            if(containsChar) { gameWon(player); }
        }
    }

    public static void gameWon(int player) {
        print("");
        updateGrid();
        print("Congrats! Player " + player + " has won.");
        gameOver = true;
    }

    public static void updateGrid() {
        print(gameGrid[0][0] + " " + gameGrid[1][0] + " " + gameGrid[2][0]);
        print(gameGrid[3][0] + " " + gameGrid[4][0] + " " + gameGrid[5][0]);
        print(gameGrid[6][0] + " " + gameGrid[7][0] + " " + gameGrid[8][0]);
    }

    public static void print(String x) {
        System.out.println(x);
    }
}
