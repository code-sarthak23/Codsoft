// src/NumberGenerator.java
import java.util.Random;

public class NumberGenerator {
    private Random random;
    private int range;
    
    public NumberGenerator(int range) {
        this.random = new Random();
        this.range = range;
    }
    
    public int generateNumber() {
        return random.nextInt(range) + 1; // Number between 1 and 'range'
    }
}
