import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the capital of France?",
            "What is 5 + 3?",
            "Who wrote 'Romeo and Juliet'?"
        };
        
        String[][] options = {
            {"Paris", "London", "Berlin", "Madrid"},
            {"5", "8", "12", "7"},
            {"Charles Dickens", "William Shakespeare", "J.K. Rowling", "Leo Tolstoy"}
        };
        
        int[] correctAnswers = {1, 2, 2};

        int score = 0;
        long timeLimit = 10000;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            long startTime = System.currentTimeMillis();
            System.out.print("Your answer: ");
            int userAnswer = -1;

            while ((System.currentTimeMillis() - startTime) < timeLimit) {
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                    break;
                }
            }

            if (userAnswer == -1) {
                System.out.println("Time's up!");
            } else if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("\nYour score: " + score + "/" + questions.length);
    }
}
