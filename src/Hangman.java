import java.util.Scanner;

public class Hangman {
    Scanner scan = new Scanner(System.in);

    public static String[] words = {"pepper", "orange", "citrus", "strawberry", "blueberry"};

    public static String randomWord() {
        int numWords = words.length;
        double randomDouble = Math.random();
        int randomIndex = (int) (randomDouble * numWords);
        return words[randomIndex];
    }
}
