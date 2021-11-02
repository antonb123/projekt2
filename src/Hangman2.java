import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman2 {
    public String[] words;
    Scanner scan;
    Player player;
    String currentWord;
    ArrayList<Character> placeHolders;
    ArrayList<Character> missedGuesses;
    int misses;
    char guess;

    public Hangman2() {
        words = new String[] {"pepper", "orange", "citrus", "strawberry", "blueberry"};
        scan = new Scanner(System.in);
        currentWord = null;
        placeHolders = new ArrayList<>();
        missedGuesses = new ArrayList<>();
        misses = 0;
    }

    public void run() {
        welcome();
        currentWord = randomWord();
        initLists();
        System.out.println("Hello " + Player.getName() + ", let the game begin");
        while(misses < 6) {
           printInfo();
           printPlaceholders();
           printMissedGuesses();
           enterLetter();
           if (checkGuess(currentWord, guess)) {
               updatePlaceholders(currentWord, placeHolders, guess);
           } else if (!checkGuess(currentWord, guess)) {
               updateMissedGuesses(currentWord, missedGuesses, guess);
               misses++;
           }
        }
    }

    private void enterLetter() {
        System.out.print("Enter one letter:   ");
        guess = scan.nextLine().charAt(0);
        System.out.println();
    }

    public void printMissedGuesses() {
        List<Character> temp = new ArrayList<>();
        System.out.print("Misses:   ");
        for (int i = 0; i < missedGuesses.size(); i++) {
           char list = missedGuesses.get(i);
           temp.add(i, list);
        }
        System.out.println(temp);
        System.out.println();
    }

    public void printInfo() {
        System.out.print(Gallows.gallows[misses]);
        System.out.print("Word:   ");
    }

    public void updateMissedGuesses(String word, ArrayList<Character> placeholders , char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != guess) {
                missedGuesses.add(i, guess);
            }
        }
    }

    public void updatePlaceholders(String word, ArrayList<Character> placeholders , char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                placeholders.set(i, guess);
            }
        }
    }

    private void printPlaceholders() {
        for(var placeholder : placeHolders) {
            System.out.print(" " + placeholder);
        }
        System.out.println();
        System.out.println();
    }

    private void initLists() {
        for(int i = 0; i < currentWord.length(); i++) {
            placeHolders.add('_');
        }
    }

    private void welcome() {
        System.out.println("Welcome to Hangman!");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        player = new Player(name);
    }

    public boolean checkGuess(String word, char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                return true;
            }
        }
        return false;
    }

    public String randomWord() {
        int numWords = words.length;
        double randomDouble = Math.random();
        int randomIndex = (int) (randomDouble * numWords);
        return words[randomIndex];
    }
}
