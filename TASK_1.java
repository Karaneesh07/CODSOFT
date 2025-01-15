import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int random_num = random.nextInt(1, 101);
            int maxAttempts = 7; 
            int attempts = 0;
            boolean guessedCorrectly = false;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have picked a number between 1 and 100.");
    System.out.println("You have " + maxAttempts + " attempts to guess it. Good luck!");

        while (attempts < maxAttempts && guessedCorrectly == false) {
                System.out.print("Enter your guess: ");
                int userGuess = num.nextInt();
                attempts++;

                if (userGuess == random_num) {
                    guessedCorrectly = true; 
                    System.out.println("Congrats! You guessed the correct number in " + attempts + " attempts.");
                } else if (userGuess < random_num) {
                    System.out.println("Too low! Try to guess high.");
                } else {
                    System.out.println("Too high! Try to guess low.");
                }
                if(guessedCorrectly == false && attempts!=7)
                {
                System.out.println("You have left "+(maxAttempts-attempts)+" attempts to guess the random number.");
            }
    }
    
            if (guessedCorrectly==false) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + random_num + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = num.next().equalsIgnoreCase("yes");
        }


        System.out.println("Thanks for playing! Goodbye.");
        num.close();
    }
}
