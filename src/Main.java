import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int points = 0;

        String[] question = {
                "are you epic?",
                "will you marry me?",
                "why do they call it oven when you of in the cold food of out hot eat the food?"
        };

        String[] answer = {
                "yes",
                "no",
                "because"
        };

        String[] responses = {
                "You got it right!",
                "You done goofed up, the actual answer is: ",
        };

        // START QUIZ
        for(int loop = 0; loop < question.length; loop++) {
        System.out.println(question[loop]);

        String input = scanner.next();

        String lowercaseInput = input.toLowerCase();

        if(lowercaseInput.equals(answer[loop])) {
            points++;
            System.out.println(responses[0]);
        } else {
            System.out.println(responses[1] + answer[loop]);
        }}

        // END QUIZ
        System.out.println("Quiz is done!! Score is: " + points);
    }
}
