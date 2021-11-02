import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

public class Tester {
    @Test public void testIfWordExists() {
        Hangman d = new Hangman();
        //List<String> p = List.of("pepper", "orange", "citrus", "strawberry", "blueberry");
        //String data = Hangman.Run();
        //assertArrayEquals();
    }

    @Test public void testIfWordDoesntExist() {
        Hangman d = new Hangman();
        int zero = 0;
        List<String> p = List.of("pepper", "orange", "citrus", "strawberry", "blueberry");
        assertEquals(zero, p);
    }

    private void assertArrayEquals(List<String> p) {
    }

    @Test public void testPublicName() {
        Player p = new Player("Anton");
        String data = p.getName();
        assertEquals("Anton", data);
    }

    @Test public void printPlaceHolders() {
        //char[] placeHolders = new Hangman.printPlaceholders();
    }

    @Test public void testPrintGallows() {
        printGallows tester = new printGallows();
        String[] data = printGallows.gallows(){};
    }


}
