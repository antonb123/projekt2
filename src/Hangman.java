//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Hangman {
//    public static String[] getWords() {
//        return words;
//    }
//
//    public static void setWords(String[] words) {
//        Hangman.words = words;
//    }
//
//    public static String[] words;
//
//
//
//    public static void Run() {
//        Scanner scan = new Scanner(System.in);
//
//        words = new String[] {"pepper", "orange", "citrus", "strawberry", "blueberry"};
//
//        System.out.println("Welcome to Hangman!");
//        System.out.println("Enter your name: ");
//        String name = scan.nextLine();
//        Player.setName(name);
//        String ranWord = randomWord();
//
//        char[] placeHolders = new char[ranWord.length()];
//        for(int i = 0; i < placeHolders.length; i++) {
//            placeHolders[i] = '_';
//        }
//
//        int misses = 0;
//
//        char[] missedGuesses = new char[6];
//
//        System.out.println("Hello " + Player.getName() + ", let the game begin");
//
//
////        while (misses < 6) {
////            System.out.print(Gallows.gallows[misses]);
////            System.out.print("Word:   ");
////            printPlaceholders(placeHolders);
////            System.out.print("\n");
////
////            System.out.print("Misses:   ");
////            printMissedGuesses(missedGuesses);
////            System.out.print("\n");
////
////            System.out.print("Enter one letter:   ");
////            char guess = scan.nextLine().charAt(0);
////            System.out.print("\n");
////
////            if (checkGuess(ranWord, guess)) {
////                updatePlaceholders(ranWord, placeHolders, guess);
////            } else {
////                missedGuesses[misses] = guess;
////                misses++;
//            }
//
////            if (Arrays.equals(placeHolders, ranWord.toCharArray())) {
////                System.out.print(Gallows.gallows[misses]);
////                System.out.print("\nThe word is: ");
////                printPlaceholders(placeHolders);
////                System.out.print("\nWell done!");
////                break;
////            }
////        }
////
////        if (misses == 6) {
////            System.out.print(Gallows.gallows[6]);
////            System.out.println("\nRest in peace!");
////            System.out.println("\nThe correct word was: " + ranWord + " ");
////        }
////    }
//
////    public static boolean checkGuess(String word, char guess) {
////        for (int i = 0; i < word.length(); i++) {
////            if (word.charAt(i) == guess) {
////                return true;
////            }
////        }
////        return false;
////    }
////
////    public static String randomWord() {
////        int numWords = words.length;
////        double randomDouble = Math.random();
////        int randomIndex = (int) (randomDouble * numWords);
////        return words[randomIndex];
////    }
////
////    public static void updatePlaceholders(String word, char[] placeholders, char guess) {
////        for (int i = 0; i < word.length(); i++) {
////            if (word.charAt(i) == guess) {
////                placeholders[i] = guess;
////            }
////        }
////    }
////
////    public static void printPlaceholders(char[] placeholders) {
////        for (int i = 0; i < placeholders.length; i++) {
////            System.out.print(" " + placeholders[i]);
////        }
////        System.out.print("\n");
////    }
////
////    public static void printMissedGuesses(char[] misses) {
////        for (int i = 0; i < misses.length; i++) {
////            System.out.print(misses[i]);
////        }
////    }
//
//}
