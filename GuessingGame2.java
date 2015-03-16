import java.util.Random;
import java.util.Scanner;

public class GuessingGame2 {
	public static void main(String[] args) {

		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int guess;
		boolean newGame;
		String reply;

		// These 5 lines represent starting dialogue with first game....
		System.out.println("Let's play a game!");
		System.out.println("I'm thinking of a number between one and ten.");
		System.out.println("Can you guess what number I'm thinking of?");
		System.out.println();
		System.out.println("Enter your first guess:");

		do {
			int numberToGuess = rand.nextInt(10);
			int numberOfTries = 0;
		// Start of main game loop.
		boolean win = false;
		do {

			guess = input.nextInt();
			numberOfTries++;

			if (guess == numberToGuess) {
				win = true;
			} else if (guess > numberToGuess) {
				System.out.println("Sorry, that's too high.");
				System.out.println("Guess again:");
			} else if (guess < numberToGuess) {
				System.out.println("Nope...that's too low.");
				System.out.println("Guess again:");
			}

		} while (!win);

		System.out.println("Congratulations! You got it!");
		System.out.println("The number I was thinking of was " + numberToGuess);
		System.out.println("and it took you " + numberOfTries + " tries.");
		System.out.println();
		System.out.println("Would you like to play again? Type yes or no.");

		// end of main game loop.

		input.nextLine();  // skip EOL after latest guess
		reply = input.nextLine();
		newGame = reply.equals("yes");

		if (newGame) {
			// Starting dialogue for subsequent games....
			System.out.println("Great!");
			System.out
					.println("I'm thinking of a new number between one and ten.");
			System.out.println();
			System.out.println("Enter your first guess:");

			// Place to restart next game should go here!!!

		}

		else {
			System.out.println("Okay, maybe another time.  Bye!");

		}
		} while (newGame);

		input.close();
	}
}
