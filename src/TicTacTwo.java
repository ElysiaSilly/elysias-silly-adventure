import java.util.Scanner;

public class TicTacTwo {
    public static void main(String[] args) {

        String[][] ticTacToe = {
                {"1", "•", "ADG"}, {"2", "•", "AE"}, {"3", "•", "AFH"},
                {"4", "•", "BD"}, {"5", "•", "BEGH"}, {"6", "•", "BF"},
                {"7", "•", "CDH"}, {"8", "•", "CE"}, {"9", "•", "CFG"}
        };

        String[][] combinations = {{"A", "0"}, {"B", "0"}, {"C", "0"}, {"D", "0"}, {"E", "0"}, {"F", "0"}, {"G", "0"}, {"H", "0"}};

        boolean hasWon = false;

        while(!hasWon) {

            System.out.println(ticTacToe[0][1] + " " + ticTacToe[1][1] + " " + ticTacToe[2][1]);
            System.out.println(ticTacToe[3][1] + " " + ticTacToe[4][1] + " " + ticTacToe[5][1]);
            System.out.println(ticTacToe[6][1] + " " + ticTacToe[7][1] + " " + ticTacToe[8][1]);

            System.out.println("Your turn!");

            Scanner scanner = new Scanner(System.in);
            String playerInput = scanner.next();
            int playerInputInt = Integer.parseInt(playerInput);
            playerInputInt--;

            if(ticTacToe[playerInputInt][1] == "•") {
                ticTacToe[playerInputInt][1] = "X";

                String current = ticTacToe[playerInputInt][2];

                for (int i = 0; i < current.length(); i++) {
                    System.out.print(current.charAt(i) + " ");
                }

            } else {
                System.out.println("Denied");
            }
        }
    }
}
