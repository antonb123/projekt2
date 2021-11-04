import java.util.*;

public class Hangman {
    public String[] words;
    Scanner scan;
    Player player;
    String currentWord;
    ArrayList<Character> placeHolders;
    int misses;
    char guess;
    ArrayList<Character> guessedCharacters;
    boolean playAgain;
    String choice;

    public Hangman() {
        words = new String[] {"pepper", "orange", "citrus", "strawberry", "blueberry", "potato"};
        scan = new Scanner(System.in);
        currentWord = null;
        placeHolders = new ArrayList<>();
        guessedCharacters = new ArrayList<>();
        playAgain = true;
    }

    public void run() {

        while (playAgain) {
        welcome();
        placeHolders.clear();
        misses = 0;
        guessedCharacters.clear();
        currentWord = randomWord();
        initLists();

        System.out.println("Hello " + Player.getName() + ", let the game begin");
        System.out.println("You have 6 guesses in total");

        while(misses < 6) {
           printInfo();
           printPlaceholders();
           System.out.println("Your guessed characters: " + guessedCharacters);
           printMissedGuesses();
           enterLetter();

           if (checkGuess(currentWord, guess)) {
               updatePlaceholders(currentWord, placeHolders, guess);
           } else { misses++;
           }
           if (placeHolders.equals(wordToCharacters(currentWord))) {
                System.out.print(Gallows.gallows[misses]);
                System.out.println("The word is: " + currentWord);
                System.out.println("Well done!");
                break;
           }
        }

        if (misses == 6) {
            System.out.println(Gallows.gallows[6]);
            System.out.println("Rest in peace!");
            System.out.println("The correct word was: " + currentWord + " ");
        }
            System.out.println("Play again? Press anything to continue or no to quit game");
            choice = scan.nextLine();
            if (choice.equalsIgnoreCase("no")){
                System.out.println("Thanks for playing Hangman, have a good day!");
                playAgain = false;
            }
        }
    }

    public List<Character> wordToCharacters(String word) {
        List<Character> ch = new ArrayList<>();
        for (char c : word.toCharArray()) {
            ch.add(Character.toLowerCase(c));
        }
        return ch;
    }

    private void enterLetter() {
        System.out.print("Enter one letter:   ");
        guess = scan.nextLine().charAt(0);
        guessedCharacters.add(guess);
        System.out.println();
    }

    public boolean printMissedGuesses() {
        System.out.print("Misses: " + misses);
        System.out.println();
        return false;
    }

    public void printInfo() {
        System.out.print(Gallows.gallows[misses]);
        System.out.print("Word:   ");
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
