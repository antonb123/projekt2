import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Tester {

    @Test public void checkGuess() {
        Hangman d = new Hangman();
        boolean result = d.checkGuess("hej", 'j');
        assertTrue(result);
    }

    @Test public void checkFalseGuess() {
        Hangman d = new Hangman();
        boolean result = d.checkGuess("hej", 'n');
        assertFalse(result);
    }

    @Test public void testPublicName() {
        Player p = new Player("Anton");
        String data = p.getName();
        assertEquals("Anton", data);
    }

    @Test public void testPrintMissedGuesses() {
        Hangman d = new Hangman();
        boolean result = d.printMissedGuesses();
        assertFalse(result);
    }

    @Test public void wordToCharacters() {
        Hangman d = new Hangman();
        List<Character> result = d.wordToCharacters("strawberry");
        assertEquals('s', result.get(0));
        assertEquals('t', result.get(1));
        assertEquals('r', result.get(2));
        assertEquals('a', result.get(3));
    }

    @Test public void wordNotToCharacters() {
        Hangman d = new Hangman();
        List<Character> result = d.wordToCharacters("strawberry");
        assertNotEquals('s', result.get(1));
    }

    @Test public void testGallows() {
        String[] data = new String[Gallows.getGallows().length];
        for (int i = 0; i < data.length; i++) {
            data[i] += Gallows.getGallows();
        }
        System.out.println(Arrays.toString(data));
    }
}
