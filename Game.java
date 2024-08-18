// src/Game.java
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreManager scoreManager = new ScoreManager();
        boolean playAgain;
        
        do {
            DifficultyLevel level = new DifficultyLevel();
            int range = level.getDifficultyLevel();
            
            NumberGenerator generator = new NumberGenerator(range);
            int numberToGuess = generator.generateNumber();
            
            UserInput userInput = new UserInput();
            GameUtils utils = new GameUtils();
            
            boolean guessedCorrectly = false;
            int attempts = 0;
            int maxAttempts = 10; // Set a maximum number of attempts
            
            while (!guessedCorrectly && attempts < maxAttempts) {
                int userGuess = userInput.getUserGuess();
                attempts++;
                
                guessedCorrectly = utils.checkGuess(numberToGuess, userGuess);
                utils.displayHint(numberToGuess, userGuess);
                utils.displayResult(guessedCorrectly, attempts, maxAttempts);
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all attempts. The number was: " + numberToGuess);
            }
            
            scoreManager.updateScore(guessedCorrectly, attempts);
            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
            
        } while (playAgain);
        
        scoreManager.displayScore();
        scanner.close();
    }
}
