// src/UserInput.java
import java.util.Scanner;

public class UserInput {
    private Scanner scanner;
    
    public UserInput() {
        scanner = new Scanner(System.in);
    }
    
    public int getUserGuess() {
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }
}
