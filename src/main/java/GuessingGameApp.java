import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int attempts = 0;
        
        //Just for testing purposes.
        System.out.println("Random Number: " + randomNumber);

        //Instruction print outs.
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You will be given three attempts to guess a random number (1-10) correctly.");
        System.out.println("If you guess the number correctly, you win the game.");
        System.out.println("Input '0' to receive instructions again.");
        System.out.println("Input '-1' to exit the game.");
        
        while (/*something*/) {
            System.out.println("Please input a number between 1 and 10.");
        int guess = userInput.nextInt();
        System.out.println("User input: " + guess);
        if (guess < -1 || guess > 10) {
            System.out.println("Remember to guess a number between 1 and 10");
        }
        if (guess == 0) {
            System.out.println("You will be given three attempts to guess a random number (1-10) correctly.");
            System.out.println("If you guess the number correctly, you win the game.");
            System.out.println("Input '0' to receive instructions again.");
            System.out.println("Input '-1' to exit the game.");
            //need the opposite of a break statement or something
        }
        if (guess == -1) {
            System.out.println("You have exited the game. Goodbye.");
            break;
        }
        if (guess == randomNumber) {
            System.out.println("That's the correct guess! You win!");
            break;
        }
        if (guess > randomNumber) {
            System.out.println("Try guessing a lower number!");
        } else {
            System.out.println("Try guessing a higher number!");
        }
        // attempts incremented may need to be in a different place.
        attempts++;
        if (attempts >= 3) {
            System.out.println("Sorry you have run out of guesses!");
            System.out.println("The correct number was " + randomNumber);
        }
        }
    }
}
