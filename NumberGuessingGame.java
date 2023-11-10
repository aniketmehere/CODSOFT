//NUMBER GUESSING GAME...

import java.util.Scanner; //importing the scanner pacakge for taking the input from user.
import java.util.Random; // importing Random package is used to generate random numbers in java.

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(); // creating the object of random class is used to generate random number in
                                 // game.
        int minimum_range = 1; // declare minimum_range as 1 so number guessing start's from 1.
        int maximum_range = 100; // declare maximum_range as 100 so number guessing end's from 1.
        int maximum_attempts = 10; // declare maximum_attempts as 10.That means the user will get to play 10
                                   // rounds.
        int score = 0; // initially score is 0.
        boolean play_Again = true; // if user wants play again.

        System.out.println("Welcome to Number Guessing Game!");

        while (play_Again) { // if user wants to play
            int guess_number = r.nextInt(maximum_range - minimum_range + 1) + minimum_range; // nextInt is used for used
                                                                                             // to scan the next token
                                                                                             // of the input as an
                                                                                             // integer and for that we
                                                                                             // apply the condition.

            int attempt = 0; // initially attempts= 0
            boolean Guess = false; // if guess is false then below statement at line 19 will be executed.
            System.out.println("I'm thinking of a number between " + minimum_range + " and " + maximum_range);

            while (attempt < maximum_attempts && !Guess) { // if attempt are minimum that maximum attempts and if guess
                                                           // is not true. Then the statement at line 22 will be
                                                           // executed.
                System.out.println("Enter your guess (" + (attempt + 1) + "/" + maximum_attempts + "): ");
                int users_Guess = sc.nextInt();
                attempt++; // incrimentation of attempts.

                if (users_Guess == guess_number) { // if users guess is equal to guess number then score will be
                                                   // increment if guess is true...The statements are mentioned on line
                                                   // number 28 and 29.
                    System.out.println("Congratulations! You guessed the number in " + attempt + " attempts.");
                    score++;
                    Guess = true;
                } else if (users_Guess < guess_number) { // else if user's guess < guess number
                    System.out.println("Your guess is too low."); // then user's guess is too low.
                } else {
                    System.out.println("Your guess is too high."); // then user's guess is too high.
                }
            }
            if (!Guess) { // It checks, if "Guess" is false. Then the statement on line 37 will be
                          // executed...
                System.out.println(
                        "You've reached the maximum number of attempts. The correct number was: " + guess_number);
            }
            System.out.print("Do you want to play this game again? (yes/no): ");
            String for_play_again = sc.next().toLowerCase(); // These two lines of code at line 43 and 44 read a string
                                                             // input from the user,converts it to lowercase, and then
                                                             // check if it equals "yes."
            play_Again = for_play_again.equals("yes"); // If the input is "yes" (case-insensitive), the variable
                                                       // play_Again is set to true; otherwise, it's set to false,
                                                       // determining whether the user wants to play again.
        }
        System.out.println("Your final score = " + score + " rounds won."); // At the end the final score will be
                                                                            // displayed and how many rounds user won
                                                                            // also displayed...
        System.out.println("Thanks for playing this game!");
    }
}