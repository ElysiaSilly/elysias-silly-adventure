public class QuizValues {
    public static void main(String[] args) {

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

        QuizLogic.QuizLogic(question, points, answer, responses);
    }
}
