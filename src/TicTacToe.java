import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {

    public static String[][] grid = {
            {"•", "ADG"}, {"•", "AE"},   {"•", "AFH"},
            {"•", "BD"},  {"•", "BEGH"}, {"•", "BF"},
            {"•", "CDH"}, {"•", "CE"},   {"•", "CFG"}
    };

    public static String[][] playerScore = {
            {"A", "0", "0"}, {"B", "0", "0"}, {"C", "0", "0"}, {"D", "0", "0"}, {"E", "0", "0"}, {"F", "0", "0"}, {"G", "0", "0"}, {"H", "0", "0"}
    };

    public static void main(String[] args) {

        print("Welcome to TicTacToe! Start a game? Y/N");

        Scanner scan = new Scanner(System.in);

        boolean tryAgain = false;

        while(!tryAgain) {

            String startGame = scan.next().toLowerCase();

            switch(startGame) {
                case "y":
                    print("Awesome! Let's get started.");
                    tryAgain = true;
                    initGame();
                    break;
                case "n":
                    print("Party pooper ):");
                    tryAgain = true;
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

            if (Objects.equals(grid[playerInput][0], "•")) {
                grid[playerInput][0] = symbol;
                turnOver = true;
            } else {
                print("Space already occupied! Try again.");
            }
        }

        switch(player) {
            case 1:
                updatePlayerScore(playerInput, player,1);
                break;
            case 2:
                updatePlayerScore(playerInput, player, 2);
                break;
            default:
        }
    }

    public static void updatePlayerScore(int playerInput, int player, int playerPos) {
        String currentSpace = grid[playerInput][1];

        for(int loop = 0; loop < playerScore.length; loop++) {

            boolean containsChar = false;

            containsChar = currentSpace.contains(playerScore[loop][0]);

            if(containsChar) {
                int combinationsInt = Integer.parseInt(playerScore[loop][playerPos]);

                playerScore[loop][playerPos] = String.valueOf(combinationsInt + 1);
            }
        }

        for(int loop = 0; loop < playerScore.length; loop++) {
            boolean containsChar = playerScore[loop][playerPos].contains("3");
            if(containsChar) { gameOverWon(player); }
        }
    }

    public static void gameOverWon(int player) {
        print("");
        updateGrid();
        print("Congrats! Player " + player + " has won.");
        gameOver = true;
    }

    public static void updateGrid() {
        print(grid[0][0] + " " + grid[1][0] + " " + grid[2][0]);
        print(grid[3][0] + " " + grid[4][0] + " " + grid[5][0]);
        print(grid[6][0] + " " + grid[7][0] + " " + grid[8][0]);
    }

    public static void print(String x) {
        System.out.println(x);
    }
}
