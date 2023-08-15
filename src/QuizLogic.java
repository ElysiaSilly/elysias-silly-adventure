import java.util.Scanner;

public class QuizLogic {
    public static void quizLogic(String[] question, int points, String[] answer, String[] responses) {
        // START QUIZ
        Scanner scanner = new Scanner(System.in);

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
