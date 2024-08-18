// src/DifficultyLevel.java
import java.util.Scanner;

public class DifficultyLevel {
    private Scanner scanner;
    
    public DifficultyLevel() {
        this.scanner = new Scanner(System.in);
    }
    
    public int getDifficultyLevel() {
        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy (1-50)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-200)");
        System.out.print("Enter your choice (1/2/3): ");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return 50;
            case 2:
                return 100;
            case 3:
                return 200;
            default:
                System.out.println("Invalid choice. Defaulting to Medium (1-100).");
                return 100;
        }
    }
}
