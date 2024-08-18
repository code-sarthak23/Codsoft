// src/ScoreManager.java
public class ScoreManager {
    private int totalRounds;
    private int roundsWon;
    private int totalAttempts;
    
    public ScoreManager() {
        totalRounds = 0;
        roundsWon = 0;
        totalAttempts = 0;
    }
    
    public void updateScore(boolean guessedCorrectly, int attempts) {
        totalRounds++;
        if (guessedCorrectly) {
            roundsWon++;
            totalAttempts += attempts;
        }
    }
    
    public void displayScore() {
        System.out.println("Game Over!");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println("Average Attempts per Win: " + (roundsWon > 0 ? (double) totalAttempts / roundsWon : 0));
    }
}
