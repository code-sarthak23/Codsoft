// src/GameUtils.java
public class GameUtils {
    public boolean checkGuess(int numberToGuess, int userGuess) {
        return numberToGuess == userGuess;
    }
    
    public void displayHint(int numberToGuess, int userGuess) {
        if (userGuess < numberToGuess) {
            System.out.println("Too low! Try again.");
        } else if (userGuess > numberToGuess) {
            System.out.println("Too high! Try again.");
        }
    }
    
    public void displayResult(boolean guessedCorrectly, int attempts, int maxAttempts) {
        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("You couldn't guess the number within " + maxAttempts + " attempts.");
        }
    }
}
