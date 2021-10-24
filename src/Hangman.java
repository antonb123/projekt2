import java.util.Scanner;

public class Hangman {

    public static String[] words;

    public static void Run() {
        Scanner scan = new Scanner(System.in);
        words = new String[] {"pepper", "orange", "citrus", "strawberry", "blueberry"};
        System.out.println("Welcome to Hangman!");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        Player.setName(name);
        String ranWord = randomWord();

        char[] placeHolders = new char[ranWord.length()];
        for(int i = 0; i < placeHolders.length; i++) {
            placeHolders[i] = '_';
        }
        System.out.println("Hello " + Player.getName() + ", let the game begin");
        System.out.println("This is the hidden word: ");
        printPlaceholders(placeHolders);
        System.out.println("\nEnter a letter: ");
    }

    public static String randomWord() {
        int numWords = words.length;
        double randomDouble = Math.random();
        int randomIndex = (int) (randomDouble * numWords);
        return words[randomIndex];
    }

    public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            System.out.print(" " + placeholders[i]);
        }
        System.out.print("\n");
    }
}
